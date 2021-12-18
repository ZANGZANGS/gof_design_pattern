# 🌈GoF Design Pattern

✍
소프트웨어를 재사용성이 높게, 유연하게, 확장성을 높이고, 유지보수가 용이하게 만드는 것은 매우 어려운 일입니다.
디자인 패턴은 소프트웨어 설계에서 공통으로 발생하는 문제에 대해 자주 쓰이는 설계 방법입니다.
<br><br><br>
## 생성패턴

### Singleton Pattern
클래스의 인스턴스는 오직 하나임을 보장하며 이 인스턴스에 접근할 수 있는 방법을 제공하는 패턴

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/8083bd09ae3314216014ab94027c1e9ddf89025f)
- ✒️[설명](https://zangzangs.tistory.com/119)


### Prototype Pattern
생성할 객체들의 타입이 프로토타입인 인스턴스로부터 결정되도록 하며, 인스턴스는 새 객체를 만들기 위해 자신을 복제하는 패턴

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/ae0dc0d28f09e84ad0e2cc0968dc1b6efd9c096d)
- ✒️[설명](https://zangzangs.tistory.com/120)


### AbstractFactory Pattern
서로 연관이 있는 객체들을 묶어서 팩토리 클래스로 만들고, 이를 팩토리 조건에 따라 생성하도록 다시 팩토리를 만들어서 객체를 생성하는 패턴. 즉, 여러 제품군을 한꺼번에 생성하는 패턴

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/2058245425f7056bfddf7a4f2571c3a3efe9e78a)
- ✒️[설명](https://zangzangs.tistory.com/121)


### Builder Pattern
생성과 구현 클래스를 분리하여 동일한 과정에서도 서로 다른 인스턴스가 나오는 패턴, 일련의 과정을 단계적으로 추상화 함!

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/7b4d50b33ae1461a1b1085d1344748018e96eaca)
- ✒️[설명](https://zangzangs.tistory.com/145)

<br><br><br>
## 행위 패턴

### Template Method Pattern
상위 클래스에서 전반적인 흐름을 구현하고 하위 클래스에서 이를 상속받아 구체적인 처리를 하도록 행동을 위임하는 패턴.

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/1c54fe614c5ea26f5e3575f2c1374d7332e83cc7)
- ✒️[설명](https://zangzangs.tistory.com/146)


### Factory Method Pattern
상위 클래스에서 공통적인 부분을 처리하고, 하위 클래스에서 각각 일어날 수 있는 인스턴스에 대한 생성을 하도록 인스턴스 생성을 분리하도록 위임하는 패턴.

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/9e8f8d297c4096fe20a3aef02237e2998d5343db)
- ✒️[설명](https://zangzangs.tistory.com/147)


### Strategy Pattern
상황에따라 전략이나 알고리즘을 교체하여 사용하는 패턴

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/147eebdb5cf1f30a3e3dd890438ab59fcf9b095c)
- ✒️[설명](https://zangzangs.tistory.com/148)


### Bridge Pattern
기능의 계층과 구현의 계층을 분리하는 패턴입니다. 추상화와 구현을 분리하여 각각을 독립적으로 변경할 수 있게 하는 패턴

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/d9796a8b43c34c24448998e138c5f48c75f6d2a8)
- ✒️[설명](https://zangzangs.tistory.com/148)

### Decorator Pattern
장식과 실제 내용물을 동일시 하는 패턴으로 생성된 객체에 동적으로 행위를 추가하는 패턴입니다.

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/a3a97ba979c6fe790f3b61e79009c47822344bda)
- ✒️[설명](https://zangzangs.tistory.com/151)

### Composite Pattern
그릇과 내용물을 동일시 하는 패턴으로 하나 이상의 유사한 객체를 구성으로 설계된 객체로 모두 유사한 기능을 나타낸다.

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/c0f1966298d641b8441c780f911089d7096d0332)
- ✒️[설명](https://zangzangs.tistory.com/153)

### Adapter Pattern
서로 다른 인터페이스를 중간에서 연결해주기 위해 사용하는 패턴

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/4b4967bd4407e39105e08b91325c0b11f7e63812)
- ✒️[설명](https://zangzangs.tistory.com/154)



### State Pattern
클래스가 하나의 상태(state)에 따라 내부의 메서드의 기능이 바뀌는 경우이를 각각의 클래스로 분리하는 패턴

- 🖥️[코드](https://github.com/ZANGZANGS/gof_design_pattern/commit/965ad9e1603a76455052986ce0a1bfdd36fe9885)
- ✒️[설명](https://zangzangs.tistory.com/155)
