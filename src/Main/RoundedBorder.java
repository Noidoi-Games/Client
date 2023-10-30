package Main;

import javax.swing.border.AbstractBorder;
import java.awt.*;import javax.swing.border.AbstractBorder;
import java.awt.*;

class RoundedBorder extends AbstractBorder {
    private int borderRadius;
    private Color borderColor;

    public RoundedBorder(int borderRadius, Color borderColor) {
        this.borderRadius = borderRadius;
        this.borderColor = borderColor;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(borderColor);
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawRoundRect(x, y, width - 1, height - 1, borderRadius, borderRadius);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(borderRadius, borderRadius, borderRadius, borderRadius);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.top = insets.right = insets.bottom = borderRadius;
        return insets;
    }
}