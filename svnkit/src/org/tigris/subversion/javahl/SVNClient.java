/*
 * ====================================================================
 * Copyright (c) 2004-2007 TMate Software Ltd.  All rights reserved.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution.  The terms
 * are also available at http://svnkit.com/license.html
 * If newer versions of this license are posted there, you may use a
 * newer version instead, at your option.
 * ====================================================================
 */
package org.tigris.subversion.javahl;

import java.io.OutputStream;

import org.tmatesoft.svn.core.javahl.SVNClientImpl;

/**
 * 
 * @version 1.1.1
 * @author  TMate Software Ltd.
 */
public class SVNClient implements SVNClientInterface {

    private SVNClientImpl myDelegate;
    
    public static final class LogLevel implements SVNClientLogLevel {
    }

    public SVNClient() {
        myDelegate = SVNClientImpl.newInstance(this);
    }

    public String getLastPath() {
        return myDelegate.getLastPath();
    }

    public Status[] status(String path, boolean descend, boolean onServer, boolean getAll) throws ClientException {
        return myDelegate.status(path, descend, onServer, getAll);
    }

    public Status[] status(String path, boolean descend, boolean onServer, boolean getAll, boolean noIgnore) throws ClientException {
        return myDelegate.status(path, descend, onServer, getAll, noIgnore, false);
    }

    public Status[] status(final String path, boolean descend, boolean onServer, boolean getAll, boolean noIgnore, boolean ignoreExternals) throws ClientException {
        return myDelegate.status(path, descend, onServer, getAll, noIgnore, ignoreExternals);
    }

    public DirEntry[] list(String url, Revision revision, boolean recurse) throws ClientException {
        return myDelegate.list(url, revision, recurse);
    }

    public DirEntry[] list(String url, Revision revision, Revision pegRevision, boolean recurse) throws ClientException {
        return myDelegate.list(url, revision, pegRevision, recurse);
    }

    public Status singleStatus(final String path, boolean onServer) throws ClientException {
        return myDelegate.singleStatus(path, onServer);
    }

    public void username(String username) {
        myDelegate.username(username);
    }

    public void password(String password) {
        myDelegate.password(password);
    }

    public void setPrompt(PromptUserPassword prompt) {
        myDelegate.setPrompt(prompt);
    }

    public LogMessage[] logMessages(String path, Revision revisionStart, Revision revisionEnd) throws ClientException {
        return myDelegate.logMessages(path, revisionStart, revisionEnd);
    }

    public LogMessage[] logMessages(String path, Revision revisionStart, Revision revisionEnd, boolean stopOnCopy) throws ClientException {
        return myDelegate.logMessages(path, revisionStart, revisionEnd, stopOnCopy);
    }

    public LogMessage[] logMessages(String path, Revision revisionStart, Revision revisionEnd, boolean stopOnCopy, boolean discoverPath) throws ClientException {
        return myDelegate.logMessages(path, revisionStart, revisionEnd, stopOnCopy, discoverPath);
    }

    public LogMessage[] logMessages(String path, Revision revisionStart, Revision revisionEnd, boolean stopOnCopy, boolean discoverPath, long limit) throws ClientException {
        return myDelegate.logMessages(path, revisionStart, revisionEnd, stopOnCopy, discoverPath, limit);
    }

    public long checkout(String moduleName, String destPath, Revision revision, Revision pegRevision, boolean recurse, boolean ignoreExternals) throws ClientException {
        return myDelegate.checkout(moduleName, destPath, revision, pegRevision, recurse, ignoreExternals);
    }

    public long checkout(String moduleName, String destPath, Revision revision, boolean recurse) throws ClientException {
        return myDelegate.checkout(moduleName, destPath, revision, recurse);
    }

    /**
     * @deprecated
     */
    public void notification(Notify notify) {
        myDelegate.notification(notify);
    }

    public void notification2(Notify2 notify) {
        myDelegate.notification2(notify);
    }

    public void commitMessageHandler(CommitMessage messageHandler) {
        myDelegate.commitMessageHandler(messageHandler);
    }

    public void remove(String[] path, String message, boolean force) throws ClientException {
        myDelegate.remove(path, message, force);
    }

    public void revert(String path, boolean recurse) throws ClientException {
        myDelegate.revert(path, recurse);
    }

    public void revert(String path, int depth) throws ClientException {
        myDelegate.revert(path, depth);
    }


    public void add(String path, boolean recurse) throws ClientException {
        myDelegate.add(path, recurse);
    }

    public void add(String path, boolean recurse, boolean force) throws ClientException {
        myDelegate.add(path, recurse, force);
    }

    public long update(String path, Revision revision, boolean recurse) throws ClientException {
        return myDelegate.update(path, revision, recurse);
    }

    public long[] update(String[] path, Revision revision, boolean recurse, boolean ignoreExternals) throws ClientException {
        return myDelegate.update(path, revision, recurse, ignoreExternals);
    }

    public long commit(String[] path, String message, boolean recurse) throws ClientException {
        return myDelegate.commit(path, message, recurse);
    }

    public long commit(String[] path, String message, boolean recurse, boolean noUnlock) throws ClientException {
        return myDelegate.commit(path, message, recurse, noUnlock);
    }

    public void copy(String srcPath, String destPath, String message, Revision revision) throws ClientException {
        myDelegate.copy(srcPath, destPath, message, revision);
    }

    public void move(String srcPath, String destPath, String message, Revision revision, boolean force) throws ClientException {
        myDelegate.move(srcPath, destPath, message, revision, force);
    }

    public void move(String srcPath, String destPath, String message, boolean force) throws ClientException {
        myDelegate.move(srcPath, destPath, message, force);
    }

    public void mkdir(String[] path, String message) throws ClientException {
        myDelegate.mkdir(path, message);
    }

    public void cleanup(String path) throws ClientException {
        myDelegate.cleanup(path);
    }
    public void resolved(String path, int depth) throws SubversionException {
        myDelegate.resolved(path, depth);
    }

    public void resolved(String path, boolean recurse) throws ClientException {
        myDelegate.resolved(path, recurse);
    }

    public long doExport(String srcPath, String destPath, Revision revision, boolean force) throws ClientException {
        return myDelegate.doExport(srcPath, destPath, revision, force);
    }

    public long doExport(String srcPath, String destPath, Revision revision, Revision pegRevision, boolean force, boolean ignoreExternals, boolean recurse, String nativeEOL) throws ClientException {
        return myDelegate.doExport(srcPath, destPath, revision, pegRevision, force, ignoreExternals, recurse, nativeEOL);
    }

    public long doSwitch(String path, String url, Revision revision, boolean recurse) throws ClientException {
        return myDelegate.doSwitch(path, url, revision, recurse);
    }

    public void doImport(String path, String url, String message, boolean recurse) throws ClientException {
        myDelegate.doImport(path, url, message, recurse);
    }

    public void merge(String path1, Revision revision1, String path2, Revision revision2, String localPath, boolean force, boolean recurse) throws ClientException {
        myDelegate.merge(path1, revision1, path2, revision2, localPath, force, recurse);
    }

    public void merge(String path1, Revision revision1, String path2, Revision revision2, String localPath, boolean force, boolean recurse, boolean ignoreAncestry, boolean dryRun) throws ClientException {
        myDelegate.merge(path1, revision1, path2, revision2, localPath, force, recurse, ignoreAncestry, dryRun);
    }

    public void merge(String path, Revision pegRevision, Revision revision1, Revision revision2, String localPath, boolean force, boolean recurse, boolean ignoreAncestry, boolean dryRun) throws ClientException {
        myDelegate.merge(path, pegRevision, revision1, revision2, localPath, force, recurse, ignoreAncestry, dryRun);
    }

    public void diff(String target1, Revision revision1, String target2, Revision revision2, String outFileName, boolean recurse) throws ClientException {
        myDelegate.diff(target1, revision1, target2, revision2, outFileName, recurse);
    }

    public void diff(String target1, Revision revision1, String target2, Revision revision2, String outFileName, boolean recurse, boolean ignoreAncestry, boolean noDiffDeleted, boolean force) throws ClientException {
        myDelegate.diff(target1, revision1, target2, revision2, outFileName, recurse, ignoreAncestry, noDiffDeleted, force);
    }

    public void diff(String target, Revision pegRevision, Revision startRevision, Revision endRevision, String outFileName, boolean recurse, boolean ignoreAncestry, boolean noDiffDeleted, boolean force) throws ClientException {
        myDelegate.diff(target, pegRevision, startRevision, endRevision, outFileName, recurse, ignoreAncestry, noDiffDeleted, force);
    }

    public PropertyData[] properties(String path) throws ClientException {
        return myDelegate.properties(path);
    }

    public PropertyData[] properties(String path, Revision revision) throws ClientException {
        return myDelegate.properties(path, revision);
    }

    public PropertyData[] properties(String path, Revision revision, Revision pegRevision) throws ClientException {
        return myDelegate.properties(path, revision, pegRevision);
    }

    public void propertySet(String path, String name, byte[] value, boolean recurse) throws ClientException {
        myDelegate.propertySet(path, name, value, recurse);
    }

    public void propertySet(String path, String name, byte[] value, boolean recurse, boolean force) throws ClientException {
        myDelegate.propertySet(path, name, value, recurse, force);
    }

    public void propertySet(String path, String name, String value, boolean recurse) throws ClientException {
        myDelegate.propertySet(path, name, value, recurse);
    }

    public void propertySet(String path, String name, String value, boolean recurse, boolean force) throws ClientException {
        myDelegate.propertySet(path, name, value, recurse, force);
    }

    public void propertyRemove(String path, String name, boolean recurse) throws ClientException {
        myDelegate.propertyRemove(path, name, recurse);
    }

    public void propertyCreate(String path, String name, String value, boolean recurse) throws ClientException {
        myDelegate.propertyCreate(path, name, value, recurse);
    }

    public void propertyCreate(String path, String name, String value, boolean recurse, boolean force) throws ClientException {
        myDelegate.propertyCreate(path, name, value, recurse, force);
    }

    public void propertyCreate(String path, String name, byte[] value, boolean recurse) throws ClientException {
        myDelegate.propertyCreate(path, name, value, recurse);
    }

    public void propertyCreate(String path, String name, byte[] value, boolean recurse, boolean force) throws ClientException {
        myDelegate.propertyCreate(path, name, value, recurse, force);
    }

    public PropertyData revProperty(String path, String name, Revision rev) throws ClientException {
        return myDelegate.revProperty(path, name, rev);
    }

    public PropertyData[] revProperties(String path, Revision rev) throws ClientException {
        return myDelegate.revProperties(path, rev);
    }

    public void setRevProperty(String path, String name, Revision rev, String value, boolean force) throws ClientException {
        myDelegate.setRevProperty(path, name, rev, value, force);
    }

    public PropertyData propertyGet(String path, String name) throws ClientException {
        return myDelegate.propertyGet(path, name);
    }

    public PropertyData propertyGet(String path, String name, Revision revision) throws ClientException {
        return myDelegate.propertyGet(path, name, revision);
    }

    public PropertyData propertyGet(String path, String name, Revision revision, Revision pegRevision) throws ClientException {
        return myDelegate.propertyGet(path, name, revision, pegRevision);
    }

    public byte[] fileContent(String path, Revision revision) throws ClientException {
        return myDelegate.fileContent(path, revision);
    }

    public byte[] fileContent(String path, Revision revision, Revision pegRevision) throws ClientException {
        return myDelegate.fileContent(path, revision, pegRevision);
    }

    public void streamFileContent(String path, Revision revision, Revision pegRevision, int bufferSize, OutputStream stream) throws ClientException {
        myDelegate.streamFileContent(path, revision, pegRevision, bufferSize, stream);
    }

    public void relocate(String from, String to, String path, boolean recurse) throws ClientException {
        myDelegate.relocate(from, to, path, recurse);
    }

    public byte[] blame(String path, Revision revisionStart, Revision revisionEnd) throws ClientException {
        return myDelegate.blame(path, revisionStart, revisionEnd);
    }

    public void blame(String path, Revision revisionStart, Revision revisionEnd, BlameCallback callback) throws ClientException {
        myDelegate.blame(path, revisionStart, revisionEnd, callback);
    }

    public void blame(String path, Revision pegRevision, Revision revisionStart, Revision revisionEnd, final BlameCallback callback) throws ClientException {
        myDelegate.blame(path, pegRevision, revisionStart, revisionEnd, callback);
    }

    public void dispose() {
        myDelegate.dispose();
    }

    public void setConfigDirectory(String configDir) throws ClientException {
        myDelegate.setConfigDirectory(configDir);
    }

    public String getConfigDirectory() throws ClientException {        
        return myDelegate.getConfigDirectory();
    }

    public void cancelOperation() throws ClientException {
        myDelegate.cancelOperation();
    }

    public Info info(String path) throws ClientException {
        return myDelegate.info(path);
    }

    public void lock(String[] path, String comment, boolean force) throws ClientException {
        myDelegate.lock(path, comment, force);
    }

    public void unlock(String[] path, boolean force) throws ClientException {
        myDelegate.unlock(path, force);
    }

    public Info2[] info2(String pathOrUrl, Revision revision, Revision pegRevision, boolean recurse) throws ClientException {
        return myDelegate.info2(pathOrUrl, revision, pegRevision, recurse);
    }

    public String getVersionInfo(String path, String trailUrl, boolean lastChanged) throws ClientException {
        return myDelegate.getVersionInfo(path, trailUrl, lastChanged);
    }

    public String getAdminDirectoryName() {
        return myDelegate.getAdminDirectoryName();
    }

    public boolean isAdminDirectory(String name) {
        return myDelegate.isAdminDirectory(name);
    }

    public static String version() {
        return SVNClientImpl.version();
    }

    public static int versionMajor() {
        return SVNClientImpl.versionMajor();
    }

    public static int versionMinor() {
        return SVNClientImpl.versionMinor();
    }

    public static int versionMicro() {
        return SVNClientImpl.versionMicro();
    }

    public Version getVersion() {
        return myDelegate.getVersion();
    }
    
    public static void initNative() {
    }

    public long checkout(String moduleName, String destPath, Revision revision, Revision pegRevision, boolean recurse, boolean ignoreExternals, boolean allowUnverObstructions) throws ClientException {
        return myDelegate.checkout(moduleName, destPath, revision, pegRevision, recurse, ignoreExternals, allowUnverObstructions);
    }

    public void copy(CopySource[] sources, String destPath, String message, boolean copyAsChild) throws ClientException {
        myDelegate.copy(sources, destPath, message, copyAsChild);
    }

    public void diffSummarize(String target1, Revision revision1, String target2, Revision revision2, boolean recurse, boolean ignoreAncestry, DiffSummaryReceiver receiver) throws ClientException {
        myDelegate.diffSummarize(target1, revision1, target2, revision2, recurse, ignoreAncestry, receiver);
    }

    public long doSwitch(String path, String url, Revision revision, boolean recurse, boolean allowUnverObstructions) throws ClientException {
        return myDelegate.doSwitch(path, url, revision, recurse, allowUnverObstructions);
    }

    public void move(String[] srcPaths, String destPath, String message, boolean force, boolean moveAsChild) throws ClientException {
        myDelegate.move(srcPaths, destPath, message, force, moveAsChild);
    }

    public void setProgressListener(ProgressListener listener) {
        myDelegate.setProgressListener(listener);
    }

    public long update(String path, Revision revision, boolean recurse, boolean ignoreExternals, boolean allowUnverObstructions) throws ClientException {
        return myDelegate.update(path, revision, recurse, ignoreExternals, allowUnverObstructions);
    }

    public long[] update(String[] path, Revision revision, boolean recurse, boolean ignoreExternals, boolean allowUnverObstructions) throws ClientException {
        return myDelegate.update(path, revision, recurse, ignoreExternals, allowUnverObstructions);
    }

    public void addToChangelist(String[] paths, String changelist) throws ClientException {
        myDelegate.addToChangelist(paths, changelist);
    }

    public String[] getChangelist(String changelist, String rootPath) throws ClientException {
        return myDelegate.getChangelist(changelist, rootPath);
    }

    public void removeFromChangelist(String[] paths, String changelist) throws ClientException {
        myDelegate.removeFromChangelist(paths, changelist);
    }

    public long commit(String[] path, String message, int depth, boolean noUnlock, boolean keepChangelist, String changelistName) throws ClientException {
        return myDelegate.commit(path, message, depth, noUnlock, keepChangelist, changelistName);
    }

    public void remove(String[] path, String message, boolean force, boolean keepLocal) throws ClientException {
        myDelegate.remove(path, message, force, keepLocal);
    }

    public void blame(String path, Revision pegRevision, Revision revisionStart, Revision revisionEnd, boolean ignoreMimeType, BlameCallback callback) throws ClientException {
        myDelegate.blame(path, pegRevision, revisionStart, revisionEnd, ignoreMimeType, callback);
    }

    public LogMessage[] logMessages(String path, Revision pegRevision, Revision revisionStart, Revision revisionEnd, boolean stopOnCopy, boolean discoverPath, long limit) throws ClientException {
        return myDelegate.logMessages(path, pegRevision, revisionStart, revisionEnd, stopOnCopy, discoverPath, limit);
    }

    public void properties(String path, Revision revision, Revision pegRevision, boolean recurse, ProplistCallback callback) throws ClientException {
        myDelegate.properties(path, revision, pegRevision, recurse, callback);
    }

    public long checkout(String moduleName, String destPath, Revision revision, Revision pegRevision, int depth, boolean ignoreExternals, boolean allowUnverObstructions) throws ClientException {
        return myDelegate.checkout(moduleName, destPath, revision, pegRevision, depth, ignoreExternals, allowUnverObstructions);
    }

    public void diff(String target1, Revision revision1, String target2, Revision revision2, String outFileName, int depth, boolean ignoreAncestry, boolean noDiffDeleted, boolean force) throws ClientException {
        myDelegate.diff(target1, revision1, target2, revision2, outFileName, depth, ignoreAncestry, noDiffDeleted, force);
    }

    public void diff(String target, Revision pegRevision, Revision startRevision, Revision endRevision, String outFileName, int depth, boolean ignoreAncestry, boolean noDiffDeleted, boolean force) throws ClientException {
        myDelegate.diff(target, pegRevision, startRevision, endRevision, outFileName, depth, ignoreAncestry, noDiffDeleted, force);
    }

    public void diffSummarize(String target1, Revision revision1, String target2, Revision revision2, int depth, boolean ignoreAncestry, DiffSummaryReceiver receiver) throws ClientException {
        myDelegate.diffSummarize(target1, revision1, target2, revision2, depth, ignoreAncestry, receiver);
    }

    public void diffSummarize(String target, Revision pegRevision, Revision startRevision, Revision endRevision, int depth, boolean ignoreAncestry, DiffSummaryReceiver receiver) throws ClientException {
        myDelegate.diffSummarize(target, pegRevision, startRevision, endRevision, depth, ignoreAncestry, receiver);
    }

    public long doExport(String srcPath, String destPath, Revision revision, Revision pegRevision, boolean force, boolean ignoreExternals, int depth, String nativeEOL) throws ClientException {
        return myDelegate.doExport(srcPath, destPath, revision, pegRevision, force, ignoreExternals, depth, nativeEOL);
    }

    public long doSwitch(String path, String url, Revision revision, int depth, boolean allowUnverObstructions) throws ClientException {
        return myDelegate.doSwitch(path, url, revision, depth, allowUnverObstructions);
    }

    public MergeInfo getMergeInfo(String path, Revision revision) throws SubversionException {
        return myDelegate.getMergeInfo(path, revision);
    }

    public void info2(String pathOrUrl, Revision revision, Revision pegRevision, boolean recurse, InfoCallback callback) throws ClientException {
        myDelegate.info2(pathOrUrl, revision, pegRevision, recurse, callback);
    }

    public void logMessages(String path, Revision pegRevision, Revision revisionStart, Revision revisionEnd, boolean stopOnCopy, boolean discoverPath, long limit, LogMessageCallback callback) throws ClientException {
        myDelegate.logMessages(path, pegRevision, revisionStart, revisionEnd, stopOnCopy, discoverPath, limit, callback);
    }

    public void merge(String path1, Revision revision1, String path2, Revision revision2, String localPath, boolean force, int depth, boolean ignoreAncestry, boolean dryRun) throws ClientException {
        myDelegate.merge(path1, revision1, path2, revision2, localPath, force, depth, ignoreAncestry, dryRun);
    }

    public void merge(String path, Revision pegRevision, Revision revision1, Revision revision2, String localPath, boolean force, int depth, boolean ignoreAncestry, boolean dryRun) throws ClientException {
        myDelegate.merge(path, pegRevision, revision1, revision2, localPath, force, depth, ignoreAncestry, dryRun);
    }

    public void merge(String path, Revision pegRevision, RevisionRange[] revisions, String localPath, boolean force, int depth, boolean ignoreAncestry, boolean dryRun) throws ClientException {
        myDelegate.merge(path, pegRevision, revisions, localPath, force, depth, ignoreAncestry, dryRun);
    }

    public Status[] status(String path, int depth, boolean onServer, boolean getAll, boolean noIgnore, boolean ignoreExternals) throws ClientException {
        return myDelegate.status(path, depth, onServer, getAll, noIgnore, ignoreExternals);
    }

    public long update(String path, Revision revision, int depth, boolean ignoreExternals, boolean allowUnverObstructions) throws ClientException {
        return myDelegate.update(path, revision, depth, ignoreExternals, allowUnverObstructions);
    }

    public long[] update(String[] path, Revision revision, int depth, boolean ignoreExternals, boolean allowUnverObstructions) throws ClientException {
        return myDelegate.update(path, revision, depth, ignoreExternals, allowUnverObstructions);
    }

    public void status(String path, int depth, boolean onServer, boolean getAll, boolean noIgnore, boolean ignoreExternals, StatusCallback callback) throws ClientException {
        myDelegate.status(path, depth, onServer, getAll, noIgnore, ignoreExternals, callback);
    }

    public void list(String url, Revision revision, Revision pegRevision, int depth, int direntFields, boolean fetchLocks, ListCallback callback) throws ClientException {
        myDelegate.list(url, revision, pegRevision, depth, direntFields, fetchLocks, callback);
    }

    public void copy(CopySource[] sources, String destPath, String message, boolean copyAsChild, boolean makeParents) throws ClientException {
        myDelegate.copy(sources, destPath, message, copyAsChild, makeParents);
    }

    public void mkdir(String[] path, String message, boolean makeParents) throws ClientException {
        myDelegate.mkdir(path, message, makeParents);
    }

    public void move(String[] srcPaths, String destPath, String message, boolean force, boolean moveAsChild, boolean makeParents) throws ClientException {
        myDelegate.move(srcPaths, destPath, message, force, moveAsChild, makeParents);
    }

    public void properties(String path, Revision revision, Revision pegRevision, int depth, ProplistCallback callback) throws ClientException {
        myDelegate.properties(path, revision, pegRevision, depth, callback);
    }

    public void add(String path, boolean recurse, boolean force, boolean noIgnores, boolean addParents) throws ClientException {
        myDelegate.add(path, recurse, force, noIgnores, addParents);
    }

    public void logMessages(String path, Revision pegRevision, Revision revisionStart, Revision revisionEnd, boolean stopOnCopy, boolean discoverPath, boolean includeMergedRevisions, long limit, LogMessageCallback callback) throws ClientException {
        myDelegate.logMessages(path, pegRevision, revisionStart, revisionEnd, stopOnCopy, discoverPath, includeMergedRevisions, limit, callback);
    }

    public void logMessages(String path, Revision pegRevision, Revision revisionStart, Revision revisionEnd, boolean stopOnCopy, boolean discoverPath, boolean includeMergedRevisions, boolean omitLogText, long limit, LogMessageCallback callback) throws ClientException {
        myDelegate.logMessages(path, pegRevision, revisionStart, revisionEnd, stopOnCopy, discoverPath, includeMergedRevisions, omitLogText, limit, callback);
    }

    public void setConflictResolver(ConflictResolverCallback listener) {
        myDelegate.setConflictResolver(listener);
    }

    public long doSwitch(String path, String url, Revision revision, int depth, boolean ignoreExternals, boolean allowUnverObstructions) throws ClientException {
        return myDelegate.doSwitch(path, url, revision, depth, ignoreExternals, allowUnverObstructions);
    }

    public void blame(String path, Revision pegRevision, Revision revisionStart, Revision revisionEnd, boolean ignoreMimeType, boolean includeMergedRevisions, BlameCallback2 callback) throws ClientException {
        myDelegate.blame(path, pegRevision, revisionStart, revisionEnd, ignoreMimeType, includeMergedRevisions, callback);
    }

    public String[] suggestMergeSources(String path, Revision pegRevision) throws SubversionException {
        return myDelegate.suggestMergeSources(path, pegRevision);
    }

    public void copy(CopySource[] sources, String destPath, String message, boolean copyAsChild, boolean makeParents, boolean withMergeHistory) throws ClientException {
        myDelegate.copy(sources, destPath, message, copyAsChild, makeParents, withMergeHistory);
    }

    public void move(String[] srcPaths, String destPath, String message, boolean force, boolean moveAsChild, boolean makeParents, boolean withMergeHistory) throws ClientException {
        myDelegate.move(srcPaths, destPath, message, force, moveAsChild, makeParents, withMergeHistory);
    }

    public void add(String path, int depth, boolean force, boolean noIgnores, boolean addParents) throws ClientException {
        myDelegate.add(path, depth, force, noIgnores, addParents);
    }

    public void doImport(String path, String url, String message, int depth, boolean noIgnore, boolean ignoreUnknownNodeTypes) throws ClientException {
        myDelegate.doImport(path, url, message, depth, noIgnore, ignoreUnknownNodeTypes);
    }

    public void info2(String pathOrUrl, Revision revision, Revision pegRevision, int depth, InfoCallback callback) throws ClientException {
        myDelegate.info2(pathOrUrl, revision, pegRevision, depth, callback);
    }

    public void propertyRemove(String path, String name, int depth) throws ClientException {
        myDelegate.propertyRemove(path, name, depth);
    }

    public void propertySet(String path, String name, String value, int depth, boolean force) throws ClientException {
        myDelegate.propertySet(path, name, value, depth, force);
    }

    public RevisionRange[] getAvailableMerges(String path, Revision pegRevision, String mergeSource) throws SubversionException {
        return myDelegate.getAvailableMerges(path, pegRevision, mergeSource);
    }

    public void resolved(String path, int depth, int conflictResult) throws SubversionException {
        myDelegate.resolved(path, depth, conflictResult);
    }
}
