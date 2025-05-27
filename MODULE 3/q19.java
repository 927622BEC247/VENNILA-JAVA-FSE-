interface Playable { void play(); }
class Guitar implements Playable {
    public void play() { System.out.println("Guitar playing"); }
}
class Piano implements Playable {
    public void play() { System.out.println("Piano playing"); }
    public static void main(String[] args) {
        new Guitar().play(); new Piano().play();
    }
}