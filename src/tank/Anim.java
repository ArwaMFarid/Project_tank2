
package tank;
import com.sun.opengl.util.*;
import java.awt.*;
import javax.media.opengl.*;
import javax.swing.*;
import tank.Texture.AnimListener;

public class Anim extends JFrame {
        public static void main(String[] args) {
        new Anim();
    }

    public Anim() {
        GLCanvas glcanvas;
        Animator animator;

        AnimGLEventListener listener = new AnimGLEventListener();
        glcanvas = new GLCanvas();
        glcanvas.addGLEventListener(listener);
        glcanvas.addKeyListener(listener);
        getContentPane().add(glcanvas, BorderLayout.CENTER);
        animator = new FPSAnimator(60);
        animator.add(glcanvas);
        animator.start();

        setTitle("Tank");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setFocusable(true);
        glcanvas.requestFocus();
    }
//       public static void main(String[] args) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Anim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        new Anim();
//    }
//
//    GLCanvas glcanvas;
//    AnimGLEventListener listener;
//    static Animator animator;
//
//    public Anim() {
//
//        listener = new AnimGLEventListener();
//        glcanvas = new GLCanvas();
//        glcanvas.addGLEventListener(listener);
//        glcanvas.addKeyListener(listener);
//        getContentPane().add(glcanvas, BorderLayout.CENTER);
//        animator = new FPSAnimator(15);
//        animator.add(glcanvas);
//        animator.start();
//
//        setTitle("Anim Test");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(700, 700);
//        setLocationRelativeTo(null);
//        setVisible(true);
//        glcanvas.setFocusable(true);
//        glcanvas.requestFocus();
//    }
    
}