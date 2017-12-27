#!/bin/sh
export DPL_EAR_NAME="ear-1.0-SNAPSHOT.ear"
if [ -n "$DPL_EAR_NAME" ]
then
    if [ -n "$JBOSS_HOME" ]
    then
	if [ -f "$JBOSS_HOME/standalone/deployments/$DPL_EAR_NAME" ]
	then
	    touch $JBOSS_HOME/standalone/deployments/$DPL_EAR_NAME.skipdeploy
	    rm $JBOSS_HOME/standalone/deployments/$DPL_EAR_NAME
	    cp /home/saniok/eclipse-workspace/farmmarket/ear/target/$DPL_EAR_NAME $JBOSS_HOME/standalone/deployments
	    NUM_SLEEP=0
	    while [ ! -f "$JBOSS_HOME/standalone/deployments/$DPL_EAR_NAME.undeployed" ] && [ -f "$JBOSS_HOME/standalone/deployments/$DPL_EAR_NAME.deployed" ] && [ "$NUM_SLEEP" -lt 12 ]
	    do
		NUM_SLEEP=$(( NUM_SLEEP+1 ))
	        sleep 0.5
	    done
	    rm $JBOSS_HOME/standalone/deployments/$DPL_EAR_NAME.skipdeploy
	    if [ "$NUM_SLEEP" -ge 12 ] 
	    then
		echo "JBOSS not response"
	    else
		echo "$DPL_EAR_NAME was redeployed"
	    fi
	else
	    cp /home/saniok/eclipse-workspace/farmmarket/ear/target/$DPL_EAR_NAME $JBOSS_HOME/standalone/deployments
	    touch $JBOSS_HOME/standalone/deployments/$DPL_EAR_NAME.dodeploy
	    
	    NUM_SLEEP=0
	    while [ ! -f "$JBOSS_HOME/standalone/deployments/$DPL_EAR_NAME.deployed" ] && [ "$NUM_SLEEP" -lt 12 ]
	    do
		NUM_SLEEP=$(( NUM_SLEEP+1 ))
	        sleep 0.5
	    done
	    if [ "$NUM_SLEEP" -ge 12 ] 
	    then
		echo "JBOSS not response"
	    else
		echo "$DPL_EAR_NAME was deployed"
	    fi
	fi
    fi
fi