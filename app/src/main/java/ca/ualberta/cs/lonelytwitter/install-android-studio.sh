#!/bin/bash
# Installing android studio and ADK in a user's Home directory

# Variables
NFS_301='/remote/CMPUT301'

cd $HOME
if [ ! -d bin ]; then
  mkdir bin
fi

cd bin

echo "Installing Android Studio IDE"

unzip -q ${NFS_301}/android-studio-ide-145.3537739-linux.zip
cd android-studio/bin
echo "PATH=\$PATH:`pwd`" >> ~/.bashrc

echo "Done Installing Android Studio IDE"


echo "Installing Android SDK"
cd ~/bin
tar xzf ${NFS_301}/android-sdk_r24.4.1-linux.tgz
cd android-sdk-linux/tools
echo "PATH=\$PATH:`pwd`" >> ~/.bashrc

echo "Done Installing Android SDK"

source ~/.bashrc
