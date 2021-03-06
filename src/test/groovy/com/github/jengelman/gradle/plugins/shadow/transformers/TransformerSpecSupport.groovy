package com.github.jengelman.gradle.plugins.shadow.transformers

import org.gradle.api.file.FileTreeElement
import org.gradle.api.file.RelativePath
import org.gradle.api.internal.file.DefaultFileTreeElement
import spock.lang.Specification

class TransformerSpecSupport extends Specification {

    protected static FileTreeElement getFileElement(String path) {
        return new DefaultFileTreeElement(null, RelativePath.parse(true, path), null, null)
    }

}
