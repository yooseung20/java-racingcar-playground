import java.util.List;

public class ResultView {

	public static void ready() {
		System.out.println();
		System.out.println("실행 결과");
	}
	public static void printStatus(List<String> carStatuses) {
		for (String carStatus : carStatuses) {
			System.out.println(carStatus);
		}
		System.out.println();
	}

	public static void printWinner(List<String> winners) {
		System.out.print(winners);
		System.out.print("가 최종 우승했습니다.");
	}
}
