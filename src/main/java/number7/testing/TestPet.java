package number7.testing;

public class TestPet {
	@BeforeSuite
	void setUp() {
		System.out.println("Method @BeforeSuite");
	}

    @AfterSuite
	void tearDown() {
		System.out.println("Method @AfterSuite");
	}


    @Test(order = 1)
    void shouldTestSomethingOne() {
        System.out.println("Method-1");
    }

    @Test(order = 3)
    void shouldTestSomethingThree() {
        System.out.println("Method-3");
    }

    @Test(order = 2)
    void shouldTestSomethingTwo() {
        System.out.println("Method-2");
    }

    void shouldTestSomething2() {
        System.out.println("Method without test annotation...");
    }
}
