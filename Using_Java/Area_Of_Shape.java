import java.util.Scanner;

public class Area_Of_Shape {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int UserChoice;

        while(true){
            try{
                System.out.println(Format.C + "Enter The Value As per choice :");
                System.out.println(Format.Y + "For Area Of Circle Enter ( 1 ) ---");
                System.out.println("For Area Of Rectangle Enter ( 2 ) ---");
                System.out.println("For Area Of Triangle Enter ( 3 ) ---");
                System.out.println("To Terminate the Program Enter ( 0 ) zero ---");
                System.out.print(Format.C + "Enter : " + Format.W);
                UserChoice = scanner.nextInt();

                if(UserChoice > 3 || UserChoice < 0){
                    throw new IllegalArgumentException(Format.R + "Invalid User Choice Please Read Again" + Format.W + "\n");
                }

                if(UserChoice == 1){
                    try{
                        AreaOfShape.AreaOfCircle Area = (new AreaOfShape()).new AreaOfCircle();
                        Area.SetRadius();
                        Area.Area();
                    } catch(Exception e){
                        Format.ErrorUnknown();
                    }
                } else if(UserChoice == 2){
                    try{
                        AreaOfShape.AreaOfRectangle Area = (new AreaOfShape()).new AreaOfRectangle();
                        Area.SetHeight();
                        Area.SetWidth();
                        Area.Area();
                    } catch(Exception e){
                        Format.ErrorUnknown();
                    }
                } else if(UserChoice == 3){
                    try{
                        AreaOfShape.AreaOfTriangle Area = (new AreaOfShape()).new AreaOfTriangle();
                        Area.SetHeight();
                        Area.SetBaseWidth();
                        Area.Area();
                    } catch(Exception e){
                        Format.ErrorUnknown();
                    }
                } else if(UserChoice == 0){
                    Area_Of_Shape.scanner.close();
                    System.out.println(Format.G + "Program Ended Thanks For Using It..." + Format.W);
                    break;
                }

            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage()); 
            } catch(Exception e){
                Format.ErrorUnknown();
                scanner.nextLine();
            }
        }
    }
}


class AreaOfShape {
    class AreaOfCircle {
        private double Radius = 0;
        private double PI = 3.14159;

        public void SetRadius(){
            while(true){
                try{
                    Format.TakeInputValue("Radius");
                    Radius = Area_Of_Shape.scanner.nextDouble();

                    if(Radius < 0){
                        throw new IllegalArgumentException("Enter Valid Positive Input");
                    }

                    break;
                } catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                } catch(Exception e){
                    System.out.println("Invalid Input");
                }
            }
        }

        public void Area(){
            double AreaFor = (PI * Radius * Radius);
            String Msg = "Area of Triangle : ";
            
            Format.PrintArea(Msg, AreaFor);
        }
    }



    class AreaOfRectangle {
        private double Height = 0;
        private double Width = 0;

        public void SetHeight(){
            while(true){
                try{
                    Format.TakeInputValue("Height");
                    Height = Area_Of_Shape.scanner.nextDouble();

                    if(Height < 0){
                        throw new IllegalArgumentException("Enter Valid Positive Input");
                    }

                    break;
                } catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                } catch(Exception e){
                    System.out.println("Invalid Input");
                }
            }
        }

        public void SetWidth(){
            while(true){
                try{
                    Format.TakeInputValue("Width");
                    Width = Area_Of_Shape.scanner.nextDouble();

                    if(Width < 0){
                        throw new IllegalArgumentException("Enter Valid Positive Input");
                    }

                    break;
                } catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                } catch(Exception e){
                    System.out.println("Invalid Input");
                }
            }
        }

        public void Area(){
            double AreaFor = (Height * Width);
            String Msg = "Area of Rectangle : ";
            
            Format.PrintArea(Msg, AreaFor);
        }
    }


    class AreaOfTriangle {
        private double Height = 0;
        private double BaseWidth = 0;

        public void SetHeight(){
            while(true){
                try{
                    Format.TakeInputValue("Height");
                    Height = Area_Of_Shape.scanner.nextDouble();

                    if(Height < 0){
                        throw new IllegalArgumentException("Enter Valid Positive Input");
                    }

                    break;
                } catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                } catch(Exception e){
                    System.out.println("Invalid Input");
                }
            }
        }

        public void SetBaseWidth(){
            while(true){
                try{
                    Format.TakeInputValue("Base-Width");
                    BaseWidth = Area_Of_Shape.scanner.nextDouble();

                    if(BaseWidth < 0){
                        throw new IllegalArgumentException("Enter Valid Positive Input");
                    }

                    break;
                } catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                } catch(Exception e){
                    System.out.println("Invalid Input");
                }
            }
        }

        public void Area(){
            double AreaFor = ((Height * BaseWidth) / 2);
            String Msg = "Area of Triangle : ";
            
            Format.PrintArea(Msg, AreaFor);
        }
    }
}


class Format {
    final public static String R = "\u001B[31m";
    final public static String G = "\u001B[32m";
    final public static String Y = "\u001B[33m";
    final public static String B = "\u001B[34m";
    final public static String M = "\u001B[35m";
    final public static String C = "\u001B[36m";
    final public static String W = "\u001B[37m";

    public static void PrintArea(String message, double Formula){
        System.out.println(Format.G + message + Format.C + Formula + Format.W + "\n\n");
    }

    public static void TakeInputValue(String InputVarName){
        System.out.print(Format.B + "Enter " + InputVarName + " : " + Format.W);
    }

    public static void ErrorUnknown(){
        System.out.println(Format.R + "Something Went Wrong" + Format.W + "\n");
    }
}
