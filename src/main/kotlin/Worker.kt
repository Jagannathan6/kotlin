interface Worker {
    fun work()
    fun takeVacation()
    fun fillTimesheet() = println("Fill Worker Timesheet")
}

interface Assistant{
    fun doChores()
    fun fillTimesheet() = println("Fill Assistant Timesheet")
}

class DepartmentAssistant : Assistant {
    override fun doChores() {
        println("DOing chores as De[artment Assistant")
    }
}



class JavaProgrammer : Worker {
    override fun work() {
        println("Java Programmer is working")
    }

    override fun takeVacation() {
        println("Java Programmer is taking Vacation")
    }

}

class CSharpProgrammer : Worker {
    override fun work() {
        println("C Sharp Programmer is working")
    }

    override fun takeVacation() {
        println("C Sharp Programmer is taking vacation")
    }

}


/*class JavaManager : Worker by JavaProgrammer();
class CSharpManager : Worker by CSharpProgrammer(); */

class Manager(var staff : Worker) : Worker by staff {
    fun meeting() {
        println("In Meeting")
    }

    override fun work() {
        println("Manager of Java Programmer")
    }
}

class DeptManager(var staff: Worker, var assistant: Assistant) : Worker by staff, Assistant by assistant{
    override fun fillTimesheet()  {
        assistant.fillTimesheet()
    }
}

fun main() {
    var manager = Manager(JavaProgrammer())
    manager.takeVacation();
    manager.work()

    var assist = DeptManager(JavaProgrammer(), DepartmentAssistant())
    assist.fillTimesheet()
    assist.work()
    assist.takeVacation()
    assist.doChores()
}