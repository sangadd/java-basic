## 상속과 메모리 구조
`이 부분을 제대로 이해하는 것이 앞으로 정말정말정말정말정말정말 중요하다‼️‼️‼️`

상속 관계를 객체로 생성할 때 메모리 구조를 확인해보자.

```
ElectricCar electricCar = new ElectricCar();
```
<img src="./img1.png" alt="상속 이미지1">

> `new ElectricCar()`를 호출하면 `ElectricCar`뿐만 아니라 상속 관계에 있는 `Car`까지 포함해서 인스턴스를 생성한다.  
참조값은 x001로 하나이지만 실제로 그 안에서는 `Car`, `ElectricCar`라는 두가지 클래스 정보가 공존하는 것임 

> 상속이라고 해서 단순하게 부모의 필드와 메서드만 물려 받는게 아니다.  
상속 관계를 사용하면 부모 클래스도 함께 포함해서 생성된다.  
외부에서 볼 때는 하나의 인스턴스를 생성하는 것 같지만 내부에서는 부모와 자식이 모두 생성되고 공간도 구분된다. 

- - -
`electricCar.charge()`호출 

<img src="./img2.png" alt="상속 이미지2">

> `electricCar.charge()`를 호출하면 참조값을 확인하기 위해 x001.charge()를 호출한다.  
    따라서 x001을 찾아서 charge()를 호출하면 되는 것이다.   

> 그런데 상속 관계의 경우에는 내부에 부모와 자식이 존재한다.  
    이때 부모인 Car를 통해서 charge()를 찾을지 아니면 ElectricCar를 통해서 charge()를 찾을지 선택해야 한다.  
    이때는 **호출하는 변수의 타입(클래스)을 기준으로 선택** 한다.
    electricCar이므로 인스턴스 내부에 같은 타입인 ElectricCar를 통해서 charge()를 호출한다.

- - -

<img src="./img3.png" alt="상속 이미지3">