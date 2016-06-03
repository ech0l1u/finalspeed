package net.fs.rudp;

public class ConnectException extends Exception {

    private static final long serialVersionUID = 8735513900170495107L;
    String message;

    ConnectException(String message) {
        this.message = message;
    }

    @Override
    public void printStackTrace() {
        //#MLog.println("连接异常 "+message);
    }

}
