package state;

public class NoQuarterState implements state.State {
    private GumballMachine gumballMachine;
    
    public NoQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
    	this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어 주세요.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어 주세요.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어주세요.");
	}

}
