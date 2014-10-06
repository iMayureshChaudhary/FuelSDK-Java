//
// This file is part of the Fuel Java SDK.
//
// Copyright (C) 2013, 2014 ExactTarget, Inc.
// All rights reserved.
//
// Permission is hereby granted, free of charge, to any person
// obtaining a copy of this software and associated documentation
// files (the "Software"), to deal in the Software without restriction,
// including without limitation the rights to use, copy, modify,
// merge, publish, distribute, sublicense, and/or sell copies
// of the Software, and to permit persons to whom the Software
// is furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
// KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
// PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
// OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES
// OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
// OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
// THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//

package com.exacttarget.fuelsdk.soap;

import java.util.Arrays;
import java.util.List;

import com.exacttarget.fuelsdk.ETClient;
import com.exacttarget.fuelsdk.ETFolder;
import com.exacttarget.fuelsdk.ETFolderService;
import com.exacttarget.fuelsdk.ETResponse;
import com.exacttarget.fuelsdk.ETResult;
import com.exacttarget.fuelsdk.ETSdkException;
import com.exacttarget.fuelsdk.filter.ETFilter;

/**
 * @deprecated
 * For information on how to interact with folders, please see
 * {@link com.exacttarget.fuelsdk.ETFolder}.
 */
public class ETFolderServiceImpl extends ETSoapServiceImpl<ETFolder>
    implements ETFolderService
{
    public ETFolderServiceImpl()
        throws ETSdkException
    {
        super();
    }

    public ETResponse<ETFolder> get(ETClient client, String... properties)
        throws ETSdkException
    {
        return retrieve(client, ETFolder.class, null, properties);
    }

    public ETResponse<ETFolder> get(ETClient client, ETFilter filter, String... properties)
        throws ETSdkException
    {
        return retrieve(client, ETFolder.class, filter, properties);
    }

    public ETResponse<ETResult> post(ETClient client, ETFolder folder)
        throws ETSdkException
    {
        return create(client, ETFolder.class, Arrays.asList(folder));
    }

    public ETResponse<ETResult> post(ETClient client, List<ETFolder> folders)
        throws ETSdkException
    {
        return create(client, ETFolder.class, folders);
    }

    public ETResponse<ETResult> patch(ETClient client, ETFolder folder)
        throws ETSdkException
    {
        return update(client, ETFolder.class, Arrays.asList(folder));
    }

    public ETResponse<ETResult> patch(ETClient client, List<ETFolder> folders)
        throws ETSdkException
    {
        return update(client, ETFolder.class, folders);
    }

    public ETResponse<ETResult> delete(ETClient client, ETFolder folder)
        throws ETSdkException
    {
        return delete(client, ETFolder.class, Arrays.asList(folder));
    }

    public ETResponse<ETResult> delete(ETClient client, List<ETFolder> folders)
        throws ETSdkException
    {
        return delete(client, ETFolder.class, folders);
    }
}