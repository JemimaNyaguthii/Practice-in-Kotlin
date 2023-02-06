fun main(args: Array<String>) {
    val names= arrayOf ("Esther Kanoro","Gabriel Leek")
    val age= arrayOf (24,19)
    val phoneNumbers= arrayOf(792035101,743386905)
    var genderFemale= true
    val details = arrayOf("details" ,names[0],age[0],phoneNumbers[0],genderFemale)
    println(details.contentToString())
    val list = arrayOf("list",names[1],age[1],phoneNumbers[1],!genderFemale)
    println(list.contentToString())

}