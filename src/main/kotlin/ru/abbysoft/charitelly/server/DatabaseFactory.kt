import ru.abbysoft.rehearsapp.server.db.Database

class DatabaseFactory private constructor() {

    companion object {
        private val instance = InMemoryDatabase()

        fun getDefaultDatabaseInstance() : Database {
            return instance
        }
    }
}