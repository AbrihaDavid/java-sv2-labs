package activity;

import training.Tr;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint){
        trackPoints.add(trackPoint);
    }

    public double getFullElevation(){
        double result = 0;

        for (int i = 1; i<trackPoints.size();i++){
            if (trackPoints.get(i).getElevation() > trackPoints.get(i-1).getElevation()){
                result = result + (trackPoints.get(i).getElevation()-trackPoints.get(i-1).getElevation());
            }
        }
        return result;
    }

    public double getFullDecrease(){
        double result = 0;

        for (int i = 1; i<trackPoints.size();i++){
            if (trackPoints.get(i).getElevation() < trackPoints.get(i-1).getElevation()){
                result = result + (trackPoints.get(i-1).getElevation()-trackPoints.get(i).getElevation());
            }
        }
        return result;
    }

    public double getDistance(){
        double result = 0;

        for (int i = 1; i<trackPoints.size();i++){
            result = result + trackPoints.get(i-1).getDistanceFrom(trackPoints.get(i));
        }
        return result;
    }

    public  Coordinate findMinimumCoordinate(){
        double latitude = trackPoints.stream().mapToDouble(e->e.getCoordinate().getLatitude()).min().getAsDouble();
        double longitude = trackPoints.stream().mapToDouble(e->e.getCoordinate().getLongitude()).min().getAsDouble();
        return new Coordinate(latitude,longitude);
    }


    public  Coordinate findMaximumCoordinate(){
        double latitude = trackPoints.stream().mapToDouble(e->e.getCoordinate().getLatitude()).max().getAsDouble();
        double longitude = trackPoints.stream().mapToDouble(e->e.getCoordinate().getLongitude()).max().getAsDouble();
        return new Coordinate(latitude,longitude);
    }

    public double getRectangleArea(){
        return (findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude()) * (findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude());
    }

    public void loadFromGpx(InputStream inputStream){
        List<String> file = null;
        try{
            file = Files.readAllLines(Paths.get("training-solutions/src/test/resources/track.gpx"));
        } catch (IOException ioe){
            throw new IllegalStateException("No such file",ioe);
        }

        List<Coordinate> coordinates = new ArrayList<>();
        List<Double> elevations = new ArrayList<>();
        for (String s: file){
            TrackPoint t = null;
            if (s.trim().startsWith("<trkpt")){
                String[] coords = s.trim().split("lon=");
                double lat = Double.parseDouble(coords[0].substring(coords[0].indexOf('"')+1,coords[0].lastIndexOf('"')));
                double lon = Double.parseDouble(coords[1].substring(coords[1].indexOf('"')+1,coords[1].lastIndexOf('"')));

                coordinates.add(new Coordinate(lat,lon));
            }
            if (s.trim().startsWith("<ele")){
                elevations.add(Double.parseDouble(s.substring(s.indexOf('>')+1,s.lastIndexOf('<'))));
            }
        }
        for (int i = 0; i<coordinates.size();i++){
            trackPoints.add(new TrackPoint(coordinates.get(i),elevations.get(i)));
        }
    }
}
