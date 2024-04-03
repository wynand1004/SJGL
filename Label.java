import java.awt.*;

class Label
{
    private String text;
    private int x;
    private int y;
    private Color color = Color.WHITE;
    
    Label(String text, int x, int y)
    {
        this.text = text;
        this.x = x;
        this.y = y;
    }
    
    public void render(Graphics g)
    {
        g.setFont(new Font(g.getFont().getFontName(), Font.PLAIN, 24)); 
        g.setColor(this.color);
        g.drawString(text, x, y);
    }
    
    public void setText(String text)
    {
        this.text = text;
    }
    
    public void setColor(Color color)
    {
        this.color = color;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
}