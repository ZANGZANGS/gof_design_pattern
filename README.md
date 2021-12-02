# 🌈GoF Design Pattern

✍
소프트웨어를 재사용성이 높게, 유연하게, 확장성을 높이고, 유지보수가 용이하게 만드는 것은 매우 어려운 일입니다.
디자인 패턴은 소프트웨어 설계에서 공통으로 발생하는 문제에 대해 자주 쓰이는 설계 방법입니다.

##생성패턴

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

