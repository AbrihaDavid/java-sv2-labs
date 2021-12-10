package statemachine.typewriter;

public enum TypeWriterState {
    LOWER {
        TypeWriterState next(){
            return TypeWriterState.UPPER;
        }
    },
    UPPER {
        TypeWriterState next(){
            return TypeWriterState.LOWER;
        }
    };

    abstract TypeWriterState next();
}
