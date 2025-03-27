package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImplantacaoSaldoConta extends AbstractSankhyaEntity<ImplantacaoSaldoConta> {
   public BigDecimal getCodAgeBenef() {
        return this.getVo().asBigDecimal("CODAGEBENEF");
   }

   public void setCodAgeBenef(BigDecimal codAgeBenef) {
        markAsChanged("CODAGEBENEF", codAgeBenef);
   }

   public BigDecimal getCodCtaBenef() {
        return this.getVo().asBigDecimal("CODCTABENEF");
   }

   public void setCodCtaBenef(BigDecimal codCtaBenef) {
        markAsChanged("CODCTABENEF", codCtaBenef);
   }

   public String getIdCliente() {
        return this.getVo().asString("IDCLIENTE");
   }

   public void setIdCliente(String idCliente) {
        markAsChanged("IDCLIENTE", idCliente);
   }

   public BigDecimal getSaldoReal() {
        return this.getVo().asBigDecimal("SALDOREAL");
   }

   public void setSaldoReal(BigDecimal saldoReal) {
        markAsChanged("SALDOREAL", saldoReal);
   }

   public BigDecimal getSeqRem() {
        return this.getVo().asBigDecimal("SEQREM");
   }

   public void setSeqRem(BigDecimal seqRem) {
        markAsChanged("SEQREM", seqRem);
   }

   public BigDecimal getSeqRem2() {
        return this.getVo().asBigDecimal("SEQREM2");
   }

   public void setSeqRem2(BigDecimal seqRem2) {
        markAsChanged("SEQREM2", seqRem2);
   }

   public BigDecimal getTaxa() {
        return this.getVo().asBigDecimal("TAXA");
   }

   public void setTaxa(BigDecimal taxa) {
        markAsChanged("TAXA", taxa);
   }

   public String getTipoImpressora() {
        return this.getVo().asString("TIPOIMPRESSORA");
   }

   public void setTipoImpressora(String tipoImpressora) {
        markAsChanged("TIPOIMPRESSORA", tipoImpressora);
   }

   public BigDecimal getVlrMinBoleta() {
        return this.getVo().asBigDecimal("VLRMINBOLETA");
   }

   public void setVlrMinBoleta(BigDecimal vlrMinBoleta) {
        markAsChanged("VLRMINBOLETA", vlrMinBoleta);
   }

   public String getZerarAut() {
        return this.getVo().asString("ZERARAUT");
   }

   public void setZerarAut(String zerarAut) {
        markAsChanged("ZERARAUT", zerarAut);
   }

   public BigDecimal getNumCliente() {
        return this.getVo().asBigDecimal("NUMCLIENTE");
   }

   public void setNumCliente(BigDecimal numCliente) {
        markAsChanged("NUMCLIENTE", numCliente);
   }

   public String getBjbbaiBolPag() {
        return this.getVo().asString("BJBBAIBOLPAG");
   }

   public void setBjbbaiBolPag(String bjbbaiBolPag) {
        markAsChanged("BJBBAIBOLPAG", bjbbaiBolPag);
   }

   public BigDecimal getCodCtaBaixa() {
        return this.getVo().asBigDecimal("CODCTABAIXA");
   }

   public void setCodCtaBaixa(BigDecimal codCtaBaixa) {
        markAsChanged("CODCTABAIXA", codCtaBaixa);
   }

   public BigDecimal getCodLancBaixaBolRap() {
        return this.getVo().asBigDecimal("CODLANCBAIXABOLRAP");
   }

   public void setCodLancBaixaBolRap(BigDecimal codLancBaixaBolRap) {
        markAsChanged("CODLANCBAIXABOLRAP", codLancBaixaBolRap);
   }

   public BigDecimal getCodTipOperBaixaBolRap() {
        return this.getVo().asBigDecimal("CODTIPOPERBAIXABOLRAP");
   }

   public void setCodTipOperBaixaBolRap(BigDecimal codTipOperBaixaBolRap) {
        markAsChanged("CODTIPOPERBAIXABOLRAP", codTipOperBaixaBolRap);
   }

   public String getPjbChave() {
        return this.getVo().asString("PJBCHAVE");
   }

   public void setPjbChave(String pjbChave) {
        markAsChanged("PJBCHAVE", pjbChave);
   }

   public String getPjbConBaixCred() {
        return this.getVo().asString("PJBCONBAIXCRED");
   }

   public void setPjbConBaixCred(String pjbConBaixCred) {
        markAsChanged("PJBCONBAIXCRED", pjbConBaixCred);
   }

   public String getPjbCred() {
        return this.getVo().asString("PJBCRED");
   }

   public void setPjbCred(String pjbCred) {
        markAsChanged("PJBCRED", pjbCred);
   }

   public String getTipoBoleto() {
        return this.getVo().asString("TIPOBOLETO");
   }

   public void setTipoBoleto(String tipoBoleto) {
        markAsChanged("TIPOBOLETO", tipoBoleto);
   }

   public BigDecimal getNuContrato() {
        return this.getVo().asBigDecimal("NUCONTRATO");
   }

   public void setNuContrato(BigDecimal nuContrato) {
        markAsChanged("NUCONTRATO", nuContrato);
   }

   public String getCampoLivre() {
        return this.getVo().asString("CAMPOLIVRE");
   }

   public void setCampoLivre(String campoLivre) {
        markAsChanged("CAMPOLIVRE", campoLivre);
   }

   public BigDecimal getRestoSubst2() {
        return this.getVo().asBigDecimal("RESTOSUBST2");
   }

   public void setRestoSubst2(BigDecimal restoSubst2) {
        markAsChanged("RESTOSUBST2", restoSubst2);
   }

   public String getDigitoSubst1() {
        return this.getVo().asString("DIGITOSUBST1");
   }

   public void setDigitoSubst1(String digitoSubst1) {
        markAsChanged("DIGITOSUBST1", digitoSubst1);
   }

   public BigDecimal getRestoSubst3() {
        return this.getVo().asBigDecimal("RESTOSUBST3");
   }

   public void setRestoSubst3(BigDecimal restoSubst3) {
        markAsChanged("RESTOSUBST3", restoSubst3);
   }

   public BigDecimal getRestoSubst1() {
        return this.getVo().asBigDecimal("RESTOSUBST1");
   }

   public void setRestoSubst1(BigDecimal restoSubst1) {
        markAsChanged("RESTOSUBST1", restoSubst1);
   }

   public String getSubRestModulo() {
        return this.getVo().asString("SUBRESTMODULO");
   }

   public void setSubRestModulo(String subRestModulo) {
        markAsChanged("SUBRESTMODULO", subRestModulo);
   }

   public String getTipMultipSoma() {
        return this.getVo().asString("TIPMULTIPSOMA");
   }

   public void setTipMultipSoma(String tipMultipSoma) {
        markAsChanged("TIPMULTIPSOMA", tipMultipSoma);
   }

   public String getAtiva() {
        return this.getVo().asString("ATIVA");
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
   }

   public BigDecimal getCarteira() {
        return this.getVo().asBigDecimal("CARTEIRA");
   }

   public void setCarteira(BigDecimal carteira) {
        markAsChanged("CARTEIRA", carteira);
   }

   public BigDecimal getCategLanChq() {
        return this.getVo().asBigDecimal("CATEGLANCHQ");
   }

   public void setCategLanChq(BigDecimal categLanChq) {
        markAsChanged("CATEGLANCHQ", categLanChq);
   }

   public String getClasse() {
        return this.getVo().asString("CLASSE");
   }

   public void setClasse(String classe) {
        markAsChanged("CLASSE", classe);
   }

   public String getCodAge() {
        return this.getVo().asString("CODAGE");
   }

   public void setCodAge(String codAge) {
        markAsChanged("CODAGE", codAge);
   }

   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public BigDecimal getCodCorrBco() {
        return this.getVo().asBigDecimal("CODCORRBCO");
   }

   public void setCodCorrBco(BigDecimal codCorrBco) {
        markAsChanged("CODCORRBCO", codCorrBco);
   }

   public String getCodCtaBco() {
        return this.getVo().asString("CODCTABCO");
   }

   public void setCodCtaBco(String codCtaBco) {
        markAsChanged("CODCTABCO", codCtaBco);
   }

   public BigDecimal getCodCtaBcoInt() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
   }

   public BigDecimal getCodCtaBcoIntRem() {
        return this.getVo().asBigDecimal("CODCTABCOINTREM");
   }

   public void setCodCtaBcoIntRem(BigDecimal codCtaBcoIntRem) {
        markAsChanged("CODCTABCOINTREM", codCtaBcoIntRem);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodMoeda() {
        return this.getVo().asBigDecimal("CODMOEDA");
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
   }

   public BigDecimal getCodOperExcl() {
        return this.getVo().asBigDecimal("CODOPEREXCL");
   }

   public void setCodOperExcl(BigDecimal codOperExcl) {
        markAsChanged("CODOPEREXCL", codOperExcl);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCodContaRural() {
        return this.getVo().asString("CODCONTARURAL");
   }

   public void setCodContaRural(String codContaRural) {
        markAsChanged("CODCONTARURAL", codContaRural);
   }

   public String getMultipNossoNum() {
        return this.getVo().asString("MULTIPNOSSONUM");
   }

   public void setMultipNossoNum(String multipNossoNum) {
        markAsChanged("MULTIPNOSSONUM", multipNossoNum);
   }

   public String getDigitoSubst3() {
        return this.getVo().asString("DIGITOSUBST3");
   }

   public void setDigitoSubst3(String digitoSubst3) {
        markAsChanged("DIGITOSUBST3", digitoSubst3);
   }

   public String getNossoNumero() {
        return this.getVo().asString("NOSSONUMERO");
   }

   public void setNossoNumero(String nossoNumero) {
        markAsChanged("NOSSONUMERO", nossoNumero);
   }

   public String getTipModNossoNum() {
        return this.getVo().asString("TIPMODNOSSNUM");
   }

   public void setTipModNossoNum(String tipModNossoNum) {
        markAsChanged("TIPMODNOSSNUM", tipModNossoNum);
   }

   public String getDigitoSubst2() {
        return this.getVo().asString("DIGITOSUBST2");
   }

   public void setDigitoSubst2(String digitoSubst2) {
        markAsChanged("DIGITOSUBST2", digitoSubst2);
   }

   public String getNossoNumAtivo() {
        return this.getVo().asString("NOSSONUMATIVO");
   }

   public void setNossoNumAtivo(String nossoNumAtivo) {
        markAsChanged("NOSSONUMATIVO", nossoNumAtivo);
   }

   public String getLinhaDigAtivo() {
        return this.getVo().asString("LINHADIGATIVO");
   }

   public void setLinhaDigAtivo(String linhaDigAtivo) {
        markAsChanged("LINHADIGATIVO", linhaDigAtivo);
   }

   public BigDecimal getConvenio() {
        return this.getVo().asBigDecimal("CONVENIO");
   }

   public void setConvenio(BigDecimal convenio) {
        markAsChanged("CONVENIO", convenio);
   }

   public String getCtaDefEmiBol() {
        return this.getVo().asString("CTADEFEMIBOL");
   }

   public void setCtaDefEmiBol(String ctaDefEmiBol) {
        markAsChanged("CTADEFEMIBOL", ctaDefEmiBol);
   }

   public BigDecimal getCtaMinBoleta() {
        return this.getVo().asBigDecimal("CTAMINBOLETA");
   }

   public void setCtaMinBoleta(BigDecimal ctaMinBoleta) {
        markAsChanged("CTAMINBOLETA", ctaMinBoleta);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getDiasProt() {
        return this.getVo().asBigDecimal("DIASPROT");
   }

   public void setDiasProt(BigDecimal diasProt) {
        markAsChanged("DIASPROT", diasProt);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtImplant() {
        return this.getVo().asTimestamp("DTIMPLANT");
   }

   public void setDtImplant(Timestamp dtImplant) {
        markAsChanged("DTIMPLANT", dtImplant);
   }

   public String getEmiteBoleta() {
        return this.getVo().asString("EMITEBOLETA");
   }

   public void setEmiteBoleta(String emiteBoleta) {
        markAsChanged("EMITEBOLETA", emiteBoleta);
   }

   public String getExclusiva() {
        return this.getVo().asString("EXCLUSIVA");
   }

   public void setExclusiva(String exclusiva) {
        markAsChanged("EXCLUSIVA", exclusiva);
   }

   public String getImpBoleta() {
        return this.getVo().asString("IMPBOLETA");
   }

   public void setImpBoleta(String impBoleta) {
        markAsChanged("IMPBOLETA", impBoleta);
   }

   public BigDecimal getInstrucaoI() {
        return this.getVo().asBigDecimal("INSTRUCAOI");
   }

   public void setInstrucaoI(BigDecimal instrucaoI) {
        markAsChanged("INSTRUCAOI", instrucaoI);
   }

   public BigDecimal getInstrucaoII() {
        return this.getVo().asBigDecimal("INSTRUCAOII");
   }

   public void setInstrucaoII(BigDecimal instrucaoII) {
        markAsChanged("INSTRUCAOII", instrucaoII);
   }

   public BigDecimal getModalidade() {
        return this.getVo().asBigDecimal("MODALIDADE");
   }

   public void setModalidade(BigDecimal modalidade) {
        markAsChanged("MODALIDADE", modalidade);
   }

   public BigDecimal getModBoleta() {
        return this.getVo().asBigDecimal("MODBOLETA");
   }

   public void setModBoleta(BigDecimal modBoleta) {
        markAsChanged("MODBOLETA", modBoleta);
   }

   public BigDecimal getNumCheq() {
        return this.getVo().asBigDecimal("NUMCHEQ");
   }

   public void setNumCheq(BigDecimal numCheq) {
        markAsChanged("NUMCHEQ", numCheq);
   }

   public BigDecimal getNuRfeModCheqG() {
        return this.getVo().asBigDecimal("NURFEMODCHEQG");
   }

   public void setNuRfeModCheqG(BigDecimal nuRfeModCheqG) {
        markAsChanged("NURFEMODCHEQG", nuRfeModCheqG);
   }

   public BigDecimal getRemBco() {
        return this.getVo().asBigDecimal("REMBCO");
   }

   public void setRemBco(BigDecimal remBco) {
        markAsChanged("REMBCO", remBco);
   }

   public BigDecimal getRemBcoMax() {
        return this.getVo().asBigDecimal("REMBCOMAX");
   }

   public void setRemBcoMax(BigDecimal remBcoMax) {
        markAsChanged("REMBCOMAX", remBcoMax);
   }

   public BigDecimal getRemFinal() {
        return this.getVo().asBigDecimal("REMFINAL");
   }

   public void setRemFinal(BigDecimal remFinal) {
        markAsChanged("REMFINAL", remFinal);
   }

   public BigDecimal getRemFinal2() {
        return this.getVo().asBigDecimal("REMFINAL2");
   }

   public void setRemFinal2(BigDecimal remFinal2) {
        markAsChanged("REMFINAL2", remFinal2);
   }

   public BigDecimal getSaldoBco() {
        return this.getVo().asBigDecimal("SALDOBCO");
   }

   public void setSaldoBco(BigDecimal saldoBco) {
        markAsChanged("SALDOBCO", saldoBco);
   }

   public String getContabilizarDias() {
        return this.getVo().asString("CONTABILIZARDIAS");
   }

   public void setContabilizarDias(String contabilizarDias) {
        markAsChanged("CONTABILIZARDIAS", contabilizarDias);
   }

   public BigDecimal getIdSeqBol() {
        return this.getVo().asBigDecimal("IDSEQBOL");
   }

   public void setIdSeqBol(BigDecimal idSeqBol) {
        markAsChanged("IDSEQBOL", idSeqBol);
   }

   public BigDecimal getInstrucaoNegativacao() {
        return this.getVo().asBigDecimal("INSTRUCAONEGATIVACAO");
   }

   public void setInstrucaoNegativacao(BigDecimal instrucaoNegativacao) {
        markAsChanged("INSTRUCAONEGATIVACAO", instrucaoNegativacao);
   }

   public BigDecimal getInstrucaoProtesto() {
        return this.getVo().asBigDecimal("INSTRUCAOPROTESTO");
   }

   public void setInstrucaoProtesto(BigDecimal instrucaoProtesto) {
        markAsChanged("INSTRUCAOPROTESTO", instrucaoProtesto);
   }

   public String getDesConsLcdPr() {
        return this.getVo().asString("DESCONSLCDPR");
   }

   public void setDesConsLcdPr(String desConsLcdPr) {
        markAsChanged("DESCONSLCDPR", desConsLcdPr);
   }

   public String getNumContaRural() {
        return this.getVo().asString("NUMCONTARURAL");
   }

   public void setNumContaRural(String numContaRural) {
        markAsChanged("NUMCONTARURAL", numContaRural);
   }

   public String getChavePix() {
        return this.getVo().asString("CHAVEPIX");
   }

   public void setChavePix(String chavePix) {
        markAsChanged("CHAVEPIX", chavePix);
   }

   public BigDecimal getQtdDiasValPix() {
        return this.getVo().asBigDecimal("QTDDIASVALPIX");
   }

   public void setQtdDiasValPix(BigDecimal qtdDiasValPix) {
        markAsChanged("QTDDIASVALPIX", qtdDiasValPix);
   }

   public String getUrlPix() {
        return this.getVo().asString("URLPIX");
   }

   public void setUrlPix(String urlPix) {
        markAsChanged("URLPIX", urlPix);
   }

   public String getChaveApiPix() {
        return this.getVo().asString("CHAVEAPIPIX");
   }

   public void setChaveApiPix(String chaveApiPix) {
        markAsChanged("CHAVEAPIPIX", chaveApiPix);
   }

   public String getConcAutRecebPix() {
        return this.getVo().asString("CONCAUTRECEBPIX");
   }

   public void setConcAutRecebPix(String concAutRecebPix) {
        markAsChanged("CONCAUTRECEBPIX", concAutRecebPix);
   }

   public String getIdCliPix() {
        return this.getVo().asString("IDCLIPIX");
   }

   public void setIdCliPix(String idCliPix) {
        markAsChanged("IDCLIPIX", idCliPix);
   }

   public String getMenAdicPix() {
        return this.getVo().asString("MENADICPIX");
   }

   public void setMenAdicPix(String menAdicPix) {
        markAsChanged("MENADICPIX", menAdicPix);
   }

   public BigDecimal getNuRfeModBoleto() {
        return this.getVo().asBigDecimal("NURFEMODBOLETO");
   }

   public void setNuRfeModBoleto(BigDecimal nuRfeModBoleto) {
        markAsChanged("NURFEMODBOLETO", nuRfeModBoleto);
   }

   public String getSenCliPix() {
        return this.getVo().asString("SENCLIPIX");
   }

   public void setSenCliPix(String senCliPix) {
        markAsChanged("SENCLIPIX", senCliPix);
   }

   public String getTitInfAdicPix() {
        return this.getVo().asString("TITINFADICPIX");
   }

   public void setTitInfAdicPix(String titInfAdicPix) {
        markAsChanged("TITINFADICPIX", titInfAdicPix);
   }

   public String getLogoUrl() {
        return this.getVo().asString("LOGOURL");
   }

   public void setLogoUrl(String logoUrl) {
        markAsChanged("LOGOURL", logoUrl);
   }

   public Timestamp getDtEnvioApiBanco() {
        return this.getVo().asTimestamp("DTENVIOAPIBANCO");
   }

   public void setDtEnvioApiBanco(Timestamp dtEnvioApiBanco) {
        markAsChanged("DTENVIOAPIBANCO", dtEnvioApiBanco);
   }

   public String getAceitaTituloVencido() {
        return this.getVo().asString("ACEITATITULOVENCIDO");
   }

   public void setAceitaTituloVencido(String aceitaTituloVencido) {
        markAsChanged("ACEITATITULOVENCIDO", aceitaTituloVencido);
   }

   public String getApiBaixaAutomatica() {
        return this.getVo().asString("APIBAIXAAUTOMATICA");
   }

   public void setApiBaixaAutomatica(String apiBaixaAutomatica) {
        markAsChanged("APIBAIXAAUTOMATICA", apiBaixaAutomatica);
   }

   public String getApiConciliacaoAutomatica() {
        return this.getVo().asString("APICONCILIACAOAUTOMATICA");
   }

   public void setApiConciliacaoAutomatica(String apiConciliacaoAutomatica) {
        markAsChanged("APICONCILIACAOAUTOMATICA", apiConciliacaoAutomatica);
   }

   public String getDataMulta() {
        return this.getVo().asString("DATAMULTA");
   }

   public void setDataMulta(String dataMulta) {
        markAsChanged("DATAMULTA", dataMulta);
   }

   public BigDecimal getDiasMulta() {
        return this.getVo().asBigDecimal("DIASMULTA");
   }

   public void setDiasMulta(BigDecimal diasMulta) {
        markAsChanged("DIASMULTA", diasMulta);
   }

   public BigDecimal getDiasParaNegativacao() {
        return this.getVo().asBigDecimal("DIASPARANEGATIVACAO");
   }

   public void setDiasParaNegativacao(BigDecimal diasParaNegativacao) {
        markAsChanged("DIASPARANEGATIVACAO", diasParaNegativacao);
   }

   public BigDecimal getDiasProtesto() {
        return this.getVo().asBigDecimal("DIASPROTESTO");
   }

   public void setDiasProtesto(BigDecimal diasProtesto) {
        markAsChanged("DIASPROTESTO", diasProtesto);
   }

   public Timestamp getDtRegConta() {
        return this.getVo().asTimestamp("DTREGCONTA");
   }

   public void setDtRegConta(Timestamp dtRegConta) {
        markAsChanged("DTREGCONTA", dtRegConta);
   }

   public BigDecimal getIdApiBanco() {
        return this.getVo().asBigDecimal("IDAPIBANCO");
   }

   public void setIdApiBanco(BigDecimal idApiBanco) {
        markAsChanged("IDAPIBANCO", idApiBanco);
   }

   public String getIndicadorPix() {
        return this.getVo().asString("INDICADORPIX");
   }

   public void setIndicadorPix(String indicadorPix) {
        markAsChanged("INDICADORPIX", indicadorPix);
   }

   public BigDecimal getOrgaoNegativador() {
        return this.getVo().asBigDecimal("ORGAONEGATIVADOR");
   }

   public void setOrgaoNegativador(BigDecimal orgaoNegativador) {
        markAsChanged("ORGAONEGATIVADOR", orgaoNegativador);
   }

   public BigDecimal getRecebimentoDias() {
        return this.getVo().asBigDecimal("RECEBIMENTODIAS");
   }

   public void setRecebimentoDias(BigDecimal recebimentoDias) {
        markAsChanged("RECEBIMENTODIAS", recebimentoDias);
   }

   public String getRecebimentoParcial() {
        return this.getVo().asString("RECEBIMENTOPARCIAL");
   }

   public void setRecebimentoParcial(String recebimentoParcial) {
        markAsChanged("RECEBIMENTOPARCIAL", recebimentoParcial);
   }

   public String getStatusApi() {
        return this.getVo().asString("STATUSAPI");
   }

   public void setStatusApi(String statusApi) {
        markAsChanged("STATUSAPI", statusApi);
   }

   public String getTipoApiBoleto() {
        return this.getVo().asString("TIPOAPIBOLETO");
   }

   public void setTipoApiBoleto(String tipoApiBoleto) {
        markAsChanged("TIPOAPIBOLETO", tipoApiBoleto);
   }

   public String getTipoJuros() {
        return this.getVo().asString("TIPOJUROS");
   }

   public void setTipoJuros(String tipoJuros) {
        markAsChanged("TIPOJUROS", tipoJuros);
   }

   public String getTipoMulta() {
        return this.getVo().asString("TIPOMULTA");
   }

   public void setTipoMulta(String tipoMulta) {
        markAsChanged("TIPOMULTA", tipoMulta);
   }

   public BigDecimal getValorJuros() {
        return this.getVo().asBigDecimal("VALORJUROS");
   }

   public void setValorJuros(BigDecimal valorJuros) {
        markAsChanged("VALORJUROS", valorJuros);
   }

   public BigDecimal getValorMulta() {
        return this.getVo().asBigDecimal("VALORMULTA");
   }

   public void setValorMulta(BigDecimal valorMulta) {
        markAsChanged("VALORMULTA", valorMulta);
   }

   public BigDecimal getVariacao() {
        return this.getVo().asBigDecimal("VARIACAO");
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
   }

   public String getUtilizaPixPdv() {
        return this.getVo().asString("UTILIZAPIXPDV");
   }

   public void setUtilizaPixPdv(String utilizaPixPdv) {
        markAsChanged("UTILIZAPIXPDV", utilizaPixPdv);
   }

   public Timestamp getDtDescRedConta() {
        return this.getVo().asTimestamp("DTDESCREDCONTA");
   }

   public void setDtDescRedConta(Timestamp dtDescRedConta) {
        markAsChanged("DTDESCREDCONTA", dtDescRedConta);
   }

   public String getDataJuro() {
        return this.getVo().asString("DATAJURO");
   }

   public void setDataJuro(String dataJuro) {
        markAsChanged("DATAJURO", dataJuro);
   }

   public BigDecimal getDiasJuro() {
        return this.getVo().asBigDecimal("DIASJURO");
   }

   public void setDiasJuro(BigDecimal diasJuro) {
        markAsChanged("DIASJURO", diasJuro);
   }

   @Override
   public String getTableName() {
        return "TSICTA";
   }

   @Override
   public String getEntityName() {
        return "ImplantacaoSaldoConta";
   }

   @Override
   public ImplantacaoSaldoConta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
