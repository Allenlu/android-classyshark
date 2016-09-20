/*
 * Copyright 2016 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.classyshark.silverghost.translator.java.jayce;

import com.google.classyshark.silverghost.translator.java.MetaObject;
import java.io.File;

/**
 * Dex implementation of MetaObject
 */
public class MetaObjectJayce extends MetaObject {

    public MetaObjectJayce(File file) {

    }

    @Override
    public String getClassGenerics(String name) {
        return "";
    }

    @Override
    public String getName() {
        return "FancyJayce";
    }

    @Override
    public AnnotationInfo[] getAnnotations() {
        return new AnnotationInfo[0];
    }

    @Override
    public int getModifiers() {
        return 0;
    }

    @Override
    public String getSuperclass() {
        return "";
    }

    @Override
    public String getSuperclassGenerics() {
        return "";
    }

    @Override
    public InterfaceInfo[] getInterfaces() {
        return new InterfaceInfo[0];
    }

    @Override
    public FieldInfo[] getDeclaredFields() {
        return new FieldInfo[0];
    }

    @Override
    public ConstructorInfo[] getDeclaredConstructors() {
        return new ConstructorInfo[0];
    }

    @Override
    public MethodInfo[] getDeclaredMethods() {
        return new MethodInfo[0];
    }
}
