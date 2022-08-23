package com.elliot.retos;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.StringJoiner;

/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */

public class Reto05 {
    public String calculateAspectRatio(URL url) throws IOException {
        BufferedImage image = ImageIO.read(url);
        StringJoiner aspectRatio = new StringJoiner(":");

        int height = image.getHeight();
        int width = image.getWidth();

        int ratio = MCD(height, width);

        String widthRatio = String.valueOf(ratio / height);
        String heightRatio = String.valueOf(ratio / width);

        return aspectRatio.add(widthRatio).add(heightRatio)
                .toString();
    }

    private int MCD(int num, int num2) {
        if (num == 0 || num2 == 0) {
            return 0;
        }

        int abs1 = Math.abs(num);
        int abs2 = Math.abs(num2);

        int absHigher = Math.max(abs1, abs2);
        int absLower = Math.min(abs1, abs2);

        int mcd = absHigher;

        while (mcd % absLower != 0) {
            mcd += absHigher;
        }

        return mcd;
    }
}
