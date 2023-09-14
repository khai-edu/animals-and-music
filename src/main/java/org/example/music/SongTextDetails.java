package org.example.music;

import java.io.File;

public abstract class SongTextDetails implements TextDetails
{
    public File details;

    public File getDetails(){
	return details;
    }

    abstract SongTextRepresentation getSongTextRepresentation();
}
