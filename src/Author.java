public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }



    /*ГЕТТЕРЫ*/

    public String getNameAuthor() {
        return nameAuthor;
    }
    public String getSurnameAuthor() {
        return surnameAuthor;
    }



    /*СЕТТЕРЫ*/

    public void setSurnameAuthor(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }
    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }



    /*МЕТОДЫ*/

    @Override
    public String toString() {
        return (nameAuthor + "+" + surnameAuthor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor, surnameAuthor);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return nameAuthor.equals(c2.nameAuthor);
    }
}
