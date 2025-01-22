package user1;

public class algoSolu3 {
    // 유저 1의 핵심 공유 코드 (버전2)
    // 어떤 기능을 구현하는데
    // 여러가지 방식으로 구현할 수 있음
    // 그중 하나를 선택해서 버전1 작성
    // 이후 갑자기 변심해서 버전2로 변경하고
    // 핵심 메서드 시그니처 수정 후
    // 기존 내용이 부끄러워서 Force Push 하고 싶음
    public void myImportantCoreMethod(
        Integer importantParameter1,
        String importantParameter2
    ){
        // 다른 곳에서 매우 많이 호출하며
        // 연관작업을 수행해야 하는 코드
    }

    public static void main(String[] args) {
        algoSolu3 algo = new algoSolu3();
        algo.myImportantCoreMethod("아주 중요하고 방대한 작업");
        // 1. 공유 부분은 (인터페이스, 메서드 시그니처 등) 나중에 임의로 수정하면 문제가 큼
        // 2. 작업 히스토리를 남기지 않고 Force Push 를 함으로써
        //    버전1 -> 버전2로 변경된 배경이 공유되지 않음
        // 3. 유저2 입장에서는 혼자서 코드를 머지하고 에러를 해결할 수 없는 상태가 됨
        //    개발자 인원에 맞는 생산성을 발휘할 수가 없는 상태가 됨
    }
}
