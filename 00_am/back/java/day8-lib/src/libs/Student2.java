package libs;

public class Student2 {

    String id;//꼭 필요한 필드
    String name;

    Student2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
  //객체가 동일한지 비교할 때는 내부 필드의 값들이 동일한지 비교해야함.
    //------------  if (obj instance of Studuent2){ Student2 s = (Student2) obj;}
    //------------  if (obj instanceof Student2 s)와 동일
        if (obj instanceof Student2 s) {
            result = s.id.equals(id) && s.name.equals(name);
        }
        return result;
    }

// 원래 Object의 hashCode()는 해시테이블의 hash값(주소와 매핑되는 값)을 리턴, hashset에서는 중복된 값을 넣지 않아야 하는데,
// new 동일클래스(동일값1), new 클래스(동일값1)인 경우 주소(hash값)가 다르므로 동일값1이 들어가도 다른 대상으로 여김.
// 기존의 hash값을 비교하는 것으로 hashset에 넣으면 중복처리가 제대로 되지않음.
// 그 hash값의 필드의 주소가 동일한지 비교하면 이런 문제가 사라짐.
// //객체가 동일한지 비교할 때는 내부 필드의 값들이 들어있는 위치가 동일한지 비교해야함.
    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode();
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
