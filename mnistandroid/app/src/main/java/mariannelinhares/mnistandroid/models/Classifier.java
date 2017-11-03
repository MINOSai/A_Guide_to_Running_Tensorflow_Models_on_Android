package mariannelinhares.mnistandroid.models;

public interface Classifier {
    String name();

    Classification recognize(final float[] pixels);
}
