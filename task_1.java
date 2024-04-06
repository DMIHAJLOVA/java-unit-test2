@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(88);
	// Напиши код здесь
    assertEquals("Возраст меньше 18ти лет",true,isAdult);
}
