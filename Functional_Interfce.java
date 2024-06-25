 @FunctionalInterface
    interface sayable {
        void say(String msg);                     // Only 1 abstract method

         default int giveNum() {
            return 9;
        }
    }

         class functionalInterface implements sayable {
             public void say(String msg) {
                 System.out.println(msg);
             }

             public static void main(String[] args) {
                 functionalInterface fie = new functionalInterface();
                 fie.say("Hello there");
                 System.out.println(fie.giveNum());
             }
         }

