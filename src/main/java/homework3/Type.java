package homework3;

public class Type {
    Object object;
    Type nextType;
    Type prevType;

    public Type(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Type getNextType() {
        return nextType;
    }

    public void setNextType(Type nextType) {
        this.nextType = nextType;
    }

    public Type getPrevType() {
        return prevType;
    }

    public void setPrevType(Type prevType) {
        this.prevType = prevType;
    }
}
