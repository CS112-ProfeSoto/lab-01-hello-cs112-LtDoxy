/**
 * Brief description of the class
 *
 * @author Luke Howard
 *
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
Pen
-----------------------------------------
- color : String
-----------------------------------------
** Constrictors **
+ Pen()
+ Pen(color : String)
+ Pen(original : Pen)

** Setters **
+ setColor(color : String) : void
+ setAll(color : String)

** Getters **
+ getColor() : String

** Others **
+ toString() : String
+ equals(other : Pen) : boolean
-----------------------------------------
*/public class Pen
{
    /***** INSTANCE VARIABLES *****/
    String color = " ";

    /***** CONSTRUCTORS *****/
    /**DESCRIPTION: No-argument constructor. Sets all instance variables to default values.*/
    public Pen()
    {
        this.setAll("Unknown");
    }

    /**DESCRIPTION: Full constructor. Sets all instance variables to corresponding parameters.*/
    public Pen(String color)
    {
        this.setAll(color);
    }

    /**DESCRIPTION: Copy constructor. Creates a deep copy of the parameter Class by setting instance variables to same values as original.*/
    public Pen(Pen original)
    {
        if(original != null)
        {
            this.setAll(original.getColor());
        }
        else
        {
            System.out.println("ERROR: attempt to copy null Class. Exiting.");
            System.exit(0);
        }

    }

    /***** MUTATORS **** */
    /**DESCRIPTION: Sets the  instance variable to parameter.*/
    public void setColor(String color)
    {
        this.color = color;
    }

    /**DESCRIPTION: Sets all instance variables to the corresponding parameters.*/
    public void setAll(String color)
    {
        this.color = color;
    }

    /***** ACCESSORS *****/
    /**DESCRIPTION: Returns the gem instance variable.*/
    public String getColor()
    {
        return this.color;
    }

    /***** OTHER REQUIRED METHODS *****/
    /**DESCRIPTION: Returns a String representation of the calling Class object as comma separated values.*/
    public String toString()
    {
        return String.format("%s Color", this.color);
    }

    /**DESCRIPTION: Returns true if all instance variables of the calling Class object are equal to all instance variables of the parameter Class.*/
    public boolean equals(Pen other)
    {
        if(other == null)
        {
            return false;
        }
        else
        {
            return this.color.equals(other.getColor());
        }
    }

    /***** HELPER METHODS *****/
    /**DESCRIPTION: Prints array of Class type to console.*/
    public static void displayPens(Class... Pens)
    {
        for(int i = 0; i < Pens.length; i++)
        {
            if(Pens[i] == null)
            {
                System.out.printf("Pen %d is %s%n", (i + 1),"null");
            }
            else
            {
                System.out.printf("Pen %d is a %s%n", (i + 1), Pens[i].toString());
            }
        }
    }
}

