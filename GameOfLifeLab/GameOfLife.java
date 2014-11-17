import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.Scanner;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 60 rows and 57 columns
    private final int ROWS = 60;
    private final int COLS = 57;
    
    // constants for the location of the three cells initially alive
    private final int X1 = 28, Y1 = 25;
    private final int X2 = 29, Y2 = 25;
    private final int X3 = 30, Y3 = 25;
    private final int X4 = 29, Y4 = 27;
    private final int X5 = 29, Y5 = 28;
    private final int X6 = 29, Y6 = 29;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    throws InterruptedException
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        
        // create a world based on the grid
        world = new ActorWorld(grid);

        populateGame();
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock1);
        
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock1);
        
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock1);
        
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock1);
        
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, rock1);
    }
    
    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(ROWS, COLS);
        Rock rock1 = new Rock();
        
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                if(getActor(row, col) != null)
                {
                    Location test = new Location(row, col);
                    int num = grid.getOccupiedAdjacentLocations(test).size();
                    if(num == 2 || num ==3)
                    {
                       newGrid.put(test, rock1);
                    }  
                    
                }
                else
                {
                    Location test = new Location(row, col);
                    int num = grid.getOccupiedAdjacentLocations(test).size();
                    if(num ==3)
                    {
                       newGrid.put(test, rock1);
                    }  
                }
            }
        }
        
        world.setGrid(newGrid);
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
     /**
     * Wait time of 50 milliseconds
     *
     */
    public void waitTime()
    throws InterruptedException
    {
        Thread.sleep(50);
    }
    
    /**
     * Creates an instance of this class
     * Prompts user for number of generations to simulate
     * Simulates GameOfLife for indicated number of generations
     */
    public static void main(String[] args)
    throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Generations: ");
        
        int gen = input.nextInt();
        
        GameOfLife game = new GameOfLife();
        
        for(int i = 1; i <= gen; i++)
        {
            game.createNextGeneration();
            game.world.show();
            game.waitTime();
        }
    }
    
}
