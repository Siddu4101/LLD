package solidPrinciples.InterfaceSegregation.withoutISP;

import javax.naming.OperationNotSupportedException;

public abstract class Shape {
    public abstract void area();
    public abstract void volume() throws OperationNotSupportedException;
}
