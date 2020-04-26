public class MobilePhone {
    private Phone phone = new PhoneImpl();
    private Camera camera = new CameraImpl();

    public void dial() {
        phone.dial();
    }

    public void close() {
        phone.close();
    }

    public void charge() {
        phone.charge();
    }

    public void takePicture() {
        camera.takePicture();
    }

}
