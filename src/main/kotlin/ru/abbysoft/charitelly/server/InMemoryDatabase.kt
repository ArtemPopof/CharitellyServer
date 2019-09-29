
import ru.abbysoft.charitelly.server.Project
import ru.abbysoft.rehearsapp.server.db.Database

var counter = 0L

class InMemoryDatabase : Database {
    override fun getProject(id: Long): Project? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProjects(): ArrayList<Project> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addProject(project: Project) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}