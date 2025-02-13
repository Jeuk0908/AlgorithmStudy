package w3_2_OOP.corresponding.DIP;

class Switch2 {
    private Light light;

    public Switch2(Light light) {
        this.light= light;
    }

    public void flip() {
        if (light!= null) {
            light.On();
        }
    }
}

interface Light {
    void On();
}

class GreenLight implements Light {
    @Override
    public void On() {
        System.out.println("Green Light turned on");
    }
}

class RedLight2 implements Light {
    @Override
    public void On() {
        // 이 안에 어떠한 변경이나 추가 로직이 있어도 Switch 클래스에 영향을 주지 않음
        System.out.println("Red Light turned on");
    }
}