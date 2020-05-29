class Actor {
    private String m_name;
    
    public Actor(String name) {
        this.m_name = name;
    }

    public String getName() {
        return this.m_name;
    }
    
    public void act() {
        System.out.println("배우 " + this.getName() + " 은(는) 연기합니다.");
    }
}

class ActionActor extends Actor {
    private String m_talent;

    public ActionActor(String name, String talent) {
        super(name);
        this.m_talent = talent;
    }

    public void practice() {
        System.out.println("액션배우 " + this.getName() + "은(는) " + m_talent + "을(를) 연습합니다.");
    }

    public void act() {
        System.out.println("액션배우 " + this.getName() + " 은(는) 액션 연기합니다.");
    }
}

public class Director {
    private Actor[] actors = new Actor[10];
    private int actorNum = 0;

    public void cast(Actor actor) {
        this.actors[actorNum] = actor;
        actorNum += 1;
    }

    public void cast(String name) {
        this.actors[actorNum] = new Actor(name);
        actorNum += 1;

    }

    public void cast(String name, String talent) {
        Actor actor = new ActionActor(name, talent);
        this.actors[actorNum] = actor;
        actorNum += 1;
    }

    public void direct() {
        for(int i=0;i<actorNum;i++) {
            Actor actor = this.actors[i];
            if(actor instanceof ActionActor) 
                ((ActionActor)actor).practice();
            actor.act();
        }
    }

    public static void main(String[] args) {
        Director d = new Director();
        Actor a = new Actor("조인성");
        Actor b = new ActionActor("장혁", "돌려차기");
        //조인성 캐스팅하기
        d.cast(a);
        //장혁 캐스팅하기
        d.cast(b);
        //일반배우 장나라 캐스팅하기
        d.cast("장나라");
        //발차기 특기를 가진 액션배우 공효진 캐스팅하기
        d.cast("공효진", "발차기");
        //감독하는 기능 호출
        //감독하는 메소드:
        //캐스팅된 모든 배우들의 연기하는 기능 호출
        //단, 배우가 액션배우일 경우 액션배우의 연습하는 기능을 먼저 호출한다.
        d.direct();
    }
}

//res
//배우 조인성은 연기합니다.
//액션배우 장혁 돌려차기를 연습합니다.
//액션배우 장혁은 액션 연기합니다.
//배우 장나라는 연기합니다.
//액션배우 공효진은 발차기를 연습합니다.
//액션배우 공효진은 액션 연기합니다.