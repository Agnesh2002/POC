package com.example.poc.databinding;
import com.example.poc.R;
import com.example.poc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegistrationBindingImpl extends FragmentRegistrationBinding implements com.example.poc.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textInputLayout, 7);
        sViewsWithIds.put(R.id.textInputLayout7, 8);
        sViewsWithIds.put(R.id.textInputLayout5, 9);
        sViewsWithIds.put(R.id.textInputLayout6, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etConfirmPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.etConfirmPass
            //         is viewModel.setEtConfirmPass((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etConfirmPassword);
            // localize variables for thread safety
            // viewModel
            authentication.AuthenticationViewModel viewModel = mViewModel;
            // viewModel.etConfirmPass
            java.lang.String viewModelEtConfirmPass = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setEtConfirmPass(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etEmailIdandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.etEmail
            //         is viewModel.setEtEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etEmailId);
            // localize variables for thread safety
            // viewModel.etEmail
            java.lang.String viewModelEtEmail = null;
            // viewModel
            authentication.AuthenticationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setEtEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.etPass
            //         is viewModel.setEtPass((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // viewModel.etPass
            java.lang.String viewModelEtPass = null;
            // viewModel
            authentication.AuthenticationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setEtPass(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.etUsername
            //         is viewModel.setEtUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUsername);
            // localize variables for thread safety
            // viewModel.etUsername
            java.lang.String viewModelEtUsername = null;
            // viewModel
            authentication.AuthenticationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setEtUsername(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentRegistrationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentRegistrationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (android.widget.ProgressBar) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            );
        this.btnRegistrationRegister.setTag(null);
        this.etConfirmPassword.setTag(null);
        this.etEmailId.setTag(null);
        this.etPassword.setTag(null);
        this.etUsername.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBarReg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.poc.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((authentication.AuthenticationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable authentication.AuthenticationViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPBarVisibility((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPBarVisibility(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelPBarVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelEtConfirmPass = null;
        java.lang.Boolean viewModelPBarVisibilityGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelPBarVisibility = null;
        java.lang.String viewModelEtUsername = null;
        int viewModelPBarVisibilityViewVISIBLEViewINVISIBLE = 0;
        java.lang.String viewModelEtEmail = null;
        java.lang.String viewModelEtPass = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelPBarVisibilityGetValue = false;
        authentication.AuthenticationViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.etConfirmPass
                        viewModelEtConfirmPass = viewModel.getEtConfirmPass();
                        // read viewModel.etUsername
                        viewModelEtUsername = viewModel.getEtUsername();
                        // read viewModel.etEmail
                        viewModelEtEmail = viewModel.getEtEmail();
                        // read viewModel.etPass
                        viewModelEtPass = viewModel.getEtPass();
                    }
            }

                if (viewModel != null) {
                    // read viewModel.pBarVisibility
                    viewModelPBarVisibility = viewModel.getPBarVisibility();
                }
                updateLiveDataRegistration(0, viewModelPBarVisibility);


                if (viewModelPBarVisibility != null) {
                    // read viewModel.pBarVisibility.getValue()
                    viewModelPBarVisibilityGetValue = viewModelPBarVisibility.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.pBarVisibility.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelPBarVisibilityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelPBarVisibilityGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelPBarVisibilityGetValue) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.pBarVisibility.getValue()) ? View.VISIBLE : View.INVISIBLE
                viewModelPBarVisibilityViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelPBarVisibilityGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnRegistrationRegister.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etConfirmPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etConfirmPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etEmailId, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etEmailIdandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etConfirmPassword, viewModelEtConfirmPass);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etEmailId, viewModelEtEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, viewModelEtPass);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUsername, viewModelEtUsername);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.progressBarReg.setVisibility(viewModelPBarVisibilityViewVISIBLEViewINVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        authentication.AuthenticationViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onRegister();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.pBarVisibility
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.pBarVisibility.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.pBarVisibility.getValue()) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}