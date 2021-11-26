package aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean on;
    private boolean play;

    public ControleRemoto() {
        this.volume = 50;
        this.on = false;
        this.play = false;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }


    public boolean getOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getPlay() {
        return play;
    }
    public void setPlay(boolean play) {
        this.play = play;
    }

    // Metodos abstratos
    @Override
    public void on() {
        this.setOn(true);
    }

    @Override
    public void off() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        System.out.format("Esta ligado: %b\n", this.getOn());
        System.out.format("Esta tocando: %b\n", this.getPlay());
        System.out.format("Volume: %d", this.getVolume());
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("||");
        }
    }

    @Override
    public void closeMenu() {
        System.out.println("Fechando menu....");
    }

    @Override
    public void moreVol() {
        if (this.getOn()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menusVol() {
        if (this.getOn()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void mute() {
        if (this.getOn() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void unmute() {
        if (this.getOn() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getOn() && !(this.getPlay())) {
            this.setPlay(true);
        }
    }

    @Override
    public void pause() {
        if (this.getOn() && this.getPlay()) {
            this.setPlay(false);
        }
    }

}
