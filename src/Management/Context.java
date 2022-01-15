package Management;

public class Context {

        private Strategy strategy;

        public Context(Strategy strategy){
            this.strategy = strategy;
        }

        public String executeStrategy(String courseName, int courseID){
            return strategy.ManageCourses(courseName, courseID);
        }
    }
