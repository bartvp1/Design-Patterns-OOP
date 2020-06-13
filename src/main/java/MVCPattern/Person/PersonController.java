package MVCPattern.Person;

public class PersonController {

    private final PersonModel personModel;
    private final PersonView personView;

    public PersonController(PersonModel personModel) {
        this.personModel = personModel;
        this.personView = new PersonView();
    }

    public void setPersonName(String name){
        personModel.setName(name);
    }

    public void setPersonAge(int age){
        personModel.setAge(age);
    }

    public String getPersonName(){
        return personModel.getName();
    }

    public int getPersonAge(){
        return personModel.getAge();
    }

    public void updateView(){
        personView.printPersonDetails(personModel);
    }
}
