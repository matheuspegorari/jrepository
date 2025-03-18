package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImplantacaoSaldoConta extends AbstractSankhyaEntity<ImplantacaoSaldoConta> {
   private BigDecimal codAgeBenef;
   private BigDecimal codCtaBenef;
   private String idCliente;
   private BigDecimal saldoReal;
   private BigDecimal seqRem;
   private BigDecimal seqRem2;
   private BigDecimal taxa;
   private String tipoImpressora;
   private BigDecimal vlrMinBoleta;
   private String zerarAut;
   private BigDecimal numCliente;
   private String bjbbaiBolPag;
   private BigDecimal codCtaBaixa;
   private BigDecimal codLancBaixaBolRap;
   private BigDecimal codTipOperBaixaBolRap;
   private String pjbChave;
   private String pjbConBaixCred;
   private String pjbCred;
   private String tipoBoleto;
   private BigDecimal nuContrato;
   private String campoLivre;
   private BigDecimal restoSubst2;
   private String digitoSubst1;
   private BigDecimal restoSubst3;
   private BigDecimal restoSubst1;
   private String subRestModulo;
   private String tipMultipSoma;
   private String ativa;
   private BigDecimal carteira;
   private BigDecimal categLanChq;
   private String classe;
   private String codAge;
   private BigDecimal codBco;
   private BigDecimal codCorrBco;
   private String codCtaBco;
   private BigDecimal codCtaBcoInt;
   private BigDecimal codCtaBcoIntRem;
   private BigDecimal codCtaCtb;
   private BigDecimal codEmp;
   private BigDecimal codMoeda;
   private BigDecimal codOperExcl;
   private BigDecimal codParc;
   private BigDecimal codUsu;
   private String codContaRural;
   private String multipNossoNum;
   private String digitoSubst3;
   private String nossoNumero;
   private String tipModNossoNum;
   private String digitoSubst2;
   private String nossoNumAtivo;
   private String linhaDigAtivo;
   private BigDecimal convenio;
   private String ctaDefEmiBol;
   private BigDecimal ctaMinBoleta;
   private String descricao;
   private BigDecimal diasProt;
   private Timestamp dtAlter;
   private Timestamp dtImplant;
   private String emiteBoleta;
   private String exclusiva;
   private String impBoleta;
   private BigDecimal instrucaoI;
   private BigDecimal instrucaoII;
   private BigDecimal modalidade;
   private BigDecimal modBoleta;
   private BigDecimal numCheq;
   private BigDecimal nuRfeModCheqG;
   private BigDecimal remBco;
   private BigDecimal remBcoMax;
   private BigDecimal remFinal;
   private BigDecimal remFinal2;
   private BigDecimal saldoBco;
   private String contabilizarDias;
   private BigDecimal idSeqBol;
   private BigDecimal instrucaoNegativacao;
   private BigDecimal instrucaoProtesto;
   private String desConsLcdPr;
   private String numContaRural;
   private String chavePix;
   private BigDecimal qtdDiasValPix;
   private String urlPix;
   private String chaveApiPix;
   private String concAutRecebPix;
   private String idCliPix;
   private String menAdicPix;
   private BigDecimal nuRfeModBoleto;
   private String senCliPix;
   private String titInfAdicPix;
   private String logoUrl;
   private Timestamp dtEnvioApiBanco;
   private String aceitaTituloVencido;
   private String apiBaixaAutomatica;
   private String apiConciliacaoAutomatica;
   private String dataMulta;
   private BigDecimal diasMulta;
   private BigDecimal diasParaNegativacao;
   private BigDecimal diasProtesto;
   private Timestamp dtRegConta;
   private BigDecimal idApiBanco;
   private String indicadorPix;
   private BigDecimal orgaoNegativador;
   private BigDecimal recebimentoDias;
   private String recebimentoParcial;
   private String statusApi;
   private String tipoApiBoleto;
   private String tipoJuros;
   private String tipoMulta;
   private BigDecimal valorJuros;
   private BigDecimal valorMulta;
   private BigDecimal variacao;
   private String utilizaPixPdv;
   private Timestamp dtDescRedConta;
   private String dataJuro;
   private BigDecimal diasJuro;

   public BigDecimal getCodAgeBenef() {
        return codAgeBenef;
   }

   public void setCodAgeBenef(BigDecimal codAgeBenef) {
        markAsChanged("CODAGEBENEF", codAgeBenef);
        this.codAgeBenef = codAgeBenef;
   }

   public BigDecimal getCodCtaBenef() {
        return codCtaBenef;
   }

   public void setCodCtaBenef(BigDecimal codCtaBenef) {
        markAsChanged("CODCTABENEF", codCtaBenef);
        this.codCtaBenef = codCtaBenef;
   }

   public String getIdCliente() {
        return idCliente;
   }

   public void setIdCliente(String idCliente) {
        markAsChanged("IDCLIENTE", idCliente);
        this.idCliente = idCliente;
   }

   public BigDecimal getSaldoReal() {
        return saldoReal;
   }

   public void setSaldoReal(BigDecimal saldoReal) {
        markAsChanged("SALDOREAL", saldoReal);
        this.saldoReal = saldoReal;
   }

   public BigDecimal getSeqRem() {
        return seqRem;
   }

   public void setSeqRem(BigDecimal seqRem) {
        markAsChanged("SEQREM", seqRem);
        this.seqRem = seqRem;
   }

   public BigDecimal getSeqRem2() {
        return seqRem2;
   }

   public void setSeqRem2(BigDecimal seqRem2) {
        markAsChanged("SEQREM2", seqRem2);
        this.seqRem2 = seqRem2;
   }

   public BigDecimal getTaxa() {
        return taxa;
   }

   public void setTaxa(BigDecimal taxa) {
        markAsChanged("TAXA", taxa);
        this.taxa = taxa;
   }

   public String getTipoImpressora() {
        return tipoImpressora;
   }

   public void setTipoImpressora(String tipoImpressora) {
        markAsChanged("TIPOIMPRESSORA", tipoImpressora);
        this.tipoImpressora = tipoImpressora;
   }

   public BigDecimal getVlrMinBoleta() {
        return vlrMinBoleta;
   }

   public void setVlrMinBoleta(BigDecimal vlrMinBoleta) {
        markAsChanged("VLRMINBOLETA", vlrMinBoleta);
        this.vlrMinBoleta = vlrMinBoleta;
   }

   public String getZerarAut() {
        return zerarAut;
   }

   public void setZerarAut(String zerarAut) {
        markAsChanged("ZERARAUT", zerarAut);
        this.zerarAut = zerarAut;
   }

   public BigDecimal getNumCliente() {
        return numCliente;
   }

   public void setNumCliente(BigDecimal numCliente) {
        markAsChanged("NUMCLIENTE", numCliente);
        this.numCliente = numCliente;
   }

   public String getBjbbaiBolPag() {
        return bjbbaiBolPag;
   }

   public void setBjbbaiBolPag(String bjbbaiBolPag) {
        markAsChanged("BJBBAIBOLPAG", bjbbaiBolPag);
        this.bjbbaiBolPag = bjbbaiBolPag;
   }

   public BigDecimal getCodCtaBaixa() {
        return codCtaBaixa;
   }

   public void setCodCtaBaixa(BigDecimal codCtaBaixa) {
        markAsChanged("CODCTABAIXA", codCtaBaixa);
        this.codCtaBaixa = codCtaBaixa;
   }

   public BigDecimal getCodLancBaixaBolRap() {
        return codLancBaixaBolRap;
   }

   public void setCodLancBaixaBolRap(BigDecimal codLancBaixaBolRap) {
        markAsChanged("CODLANCBAIXABOLRAP", codLancBaixaBolRap);
        this.codLancBaixaBolRap = codLancBaixaBolRap;
   }

   public BigDecimal getCodTipOperBaixaBolRap() {
        return codTipOperBaixaBolRap;
   }

   public void setCodTipOperBaixaBolRap(BigDecimal codTipOperBaixaBolRap) {
        markAsChanged("CODTIPOPERBAIXABOLRAP", codTipOperBaixaBolRap);
        this.codTipOperBaixaBolRap = codTipOperBaixaBolRap;
   }

   public String getPjbChave() {
        return pjbChave;
   }

   public void setPjbChave(String pjbChave) {
        markAsChanged("PJBCHAVE", pjbChave);
        this.pjbChave = pjbChave;
   }

   public String getPjbConBaixCred() {
        return pjbConBaixCred;
   }

   public void setPjbConBaixCred(String pjbConBaixCred) {
        markAsChanged("PJBCONBAIXCRED", pjbConBaixCred);
        this.pjbConBaixCred = pjbConBaixCred;
   }

   public String getPjbCred() {
        return pjbCred;
   }

   public void setPjbCred(String pjbCred) {
        markAsChanged("PJBCRED", pjbCred);
        this.pjbCred = pjbCred;
   }

   public String getTipoBoleto() {
        return tipoBoleto;
   }

   public void setTipoBoleto(String tipoBoleto) {
        markAsChanged("TIPOBOLETO", tipoBoleto);
        this.tipoBoleto = tipoBoleto;
   }

   public BigDecimal getNuContrato() {
        return nuContrato;
   }

   public void setNuContrato(BigDecimal nuContrato) {
        markAsChanged("NUCONTRATO", nuContrato);
        this.nuContrato = nuContrato;
   }

   public String getCampoLivre() {
        return campoLivre;
   }

   public void setCampoLivre(String campoLivre) {
        markAsChanged("CAMPOLIVRE", campoLivre);
        this.campoLivre = campoLivre;
   }

   public BigDecimal getRestoSubst2() {
        return restoSubst2;
   }

   public void setRestoSubst2(BigDecimal restoSubst2) {
        markAsChanged("RESTOSUBST2", restoSubst2);
        this.restoSubst2 = restoSubst2;
   }

   public String getDigitoSubst1() {
        return digitoSubst1;
   }

   public void setDigitoSubst1(String digitoSubst1) {
        markAsChanged("DIGITOSUBST1", digitoSubst1);
        this.digitoSubst1 = digitoSubst1;
   }

   public BigDecimal getRestoSubst3() {
        return restoSubst3;
   }

   public void setRestoSubst3(BigDecimal restoSubst3) {
        markAsChanged("RESTOSUBST3", restoSubst3);
        this.restoSubst3 = restoSubst3;
   }

   public BigDecimal getRestoSubst1() {
        return restoSubst1;
   }

   public void setRestoSubst1(BigDecimal restoSubst1) {
        markAsChanged("RESTOSUBST1", restoSubst1);
        this.restoSubst1 = restoSubst1;
   }

   public String getSubRestModulo() {
        return subRestModulo;
   }

   public void setSubRestModulo(String subRestModulo) {
        markAsChanged("SUBRESTMODULO", subRestModulo);
        this.subRestModulo = subRestModulo;
   }

   public String getTipMultipSoma() {
        return tipMultipSoma;
   }

   public void setTipMultipSoma(String tipMultipSoma) {
        markAsChanged("TIPMULTIPSOMA", tipMultipSoma);
        this.tipMultipSoma = tipMultipSoma;
   }

   public String getAtiva() {
        return ativa;
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
        this.ativa = ativa;
   }

   public BigDecimal getCarteira() {
        return carteira;
   }

   public void setCarteira(BigDecimal carteira) {
        markAsChanged("CARTEIRA", carteira);
        this.carteira = carteira;
   }

   public BigDecimal getCategLanChq() {
        return categLanChq;
   }

   public void setCategLanChq(BigDecimal categLanChq) {
        markAsChanged("CATEGLANCHQ", categLanChq);
        this.categLanChq = categLanChq;
   }

   public String getClasse() {
        return classe;
   }

   public void setClasse(String classe) {
        markAsChanged("CLASSE", classe);
        this.classe = classe;
   }

   public String getCodAge() {
        return codAge;
   }

   public void setCodAge(String codAge) {
        markAsChanged("CODAGE", codAge);
        this.codAge = codAge;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
        this.codBco = codBco;
   }

   public BigDecimal getCodCorrBco() {
        return codCorrBco;
   }

   public void setCodCorrBco(BigDecimal codCorrBco) {
        markAsChanged("CODCORRBCO", codCorrBco);
        this.codCorrBco = codCorrBco;
   }

   public String getCodCtaBco() {
        return codCtaBco;
   }

   public void setCodCtaBco(String codCtaBco) {
        markAsChanged("CODCTABCO", codCtaBco);
        this.codCtaBco = codCtaBco;
   }

   public BigDecimal getCodCtaBcoInt() {
        return codCtaBcoInt;
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
        this.codCtaBcoInt = codCtaBcoInt;
   }

   public BigDecimal getCodCtaBcoIntRem() {
        return codCtaBcoIntRem;
   }

   public void setCodCtaBcoIntRem(BigDecimal codCtaBcoIntRem) {
        markAsChanged("CODCTABCOINTREM", codCtaBcoIntRem);
        this.codCtaBcoIntRem = codCtaBcoIntRem;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodOperExcl() {
        return codOperExcl;
   }

   public void setCodOperExcl(BigDecimal codOperExcl) {
        markAsChanged("CODOPEREXCL", codOperExcl);
        this.codOperExcl = codOperExcl;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getCodContaRural() {
        return codContaRural;
   }

   public void setCodContaRural(String codContaRural) {
        markAsChanged("CODCONTARURAL", codContaRural);
        this.codContaRural = codContaRural;
   }

   public String getMultipNossoNum() {
        return multipNossoNum;
   }

   public void setMultipNossoNum(String multipNossoNum) {
        markAsChanged("MULTIPNOSSONUM", multipNossoNum);
        this.multipNossoNum = multipNossoNum;
   }

   public String getDigitoSubst3() {
        return digitoSubst3;
   }

   public void setDigitoSubst3(String digitoSubst3) {
        markAsChanged("DIGITOSUBST3", digitoSubst3);
        this.digitoSubst3 = digitoSubst3;
   }

   public String getNossoNumero() {
        return nossoNumero;
   }

   public void setNossoNumero(String nossoNumero) {
        markAsChanged("NOSSONUMERO", nossoNumero);
        this.nossoNumero = nossoNumero;
   }

   public String getTipModNossoNum() {
        return tipModNossoNum;
   }

   public void setTipModNossoNum(String tipModNossoNum) {
        markAsChanged("TIPMODNOSSNUM", tipModNossoNum);
        this.tipModNossoNum = tipModNossoNum;
   }

   public String getDigitoSubst2() {
        return digitoSubst2;
   }

   public void setDigitoSubst2(String digitoSubst2) {
        markAsChanged("DIGITOSUBST2", digitoSubst2);
        this.digitoSubst2 = digitoSubst2;
   }

   public String getNossoNumAtivo() {
        return nossoNumAtivo;
   }

   public void setNossoNumAtivo(String nossoNumAtivo) {
        markAsChanged("NOSSONUMATIVO", nossoNumAtivo);
        this.nossoNumAtivo = nossoNumAtivo;
   }

   public String getLinhaDigAtivo() {
        return linhaDigAtivo;
   }

   public void setLinhaDigAtivo(String linhaDigAtivo) {
        markAsChanged("LINHADIGATIVO", linhaDigAtivo);
        this.linhaDigAtivo = linhaDigAtivo;
   }

   public BigDecimal getConvenio() {
        return convenio;
   }

   public void setConvenio(BigDecimal convenio) {
        markAsChanged("CONVENIO", convenio);
        this.convenio = convenio;
   }

   public String getCtaDefEmiBol() {
        return ctaDefEmiBol;
   }

   public void setCtaDefEmiBol(String ctaDefEmiBol) {
        markAsChanged("CTADEFEMIBOL", ctaDefEmiBol);
        this.ctaDefEmiBol = ctaDefEmiBol;
   }

   public BigDecimal getCtaMinBoleta() {
        return ctaMinBoleta;
   }

   public void setCtaMinBoleta(BigDecimal ctaMinBoleta) {
        markAsChanged("CTAMINBOLETA", ctaMinBoleta);
        this.ctaMinBoleta = ctaMinBoleta;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getDiasProt() {
        return diasProt;
   }

   public void setDiasProt(BigDecimal diasProt) {
        markAsChanged("DIASPROT", diasProt);
        this.diasProt = diasProt;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtImplant() {
        return dtImplant;
   }

   public void setDtImplant(Timestamp dtImplant) {
        markAsChanged("DTIMPLANT", dtImplant);
        this.dtImplant = dtImplant;
   }

   public String getEmiteBoleta() {
        return emiteBoleta;
   }

   public void setEmiteBoleta(String emiteBoleta) {
        markAsChanged("EMITEBOLETA", emiteBoleta);
        this.emiteBoleta = emiteBoleta;
   }

   public String getExclusiva() {
        return exclusiva;
   }

   public void setExclusiva(String exclusiva) {
        markAsChanged("EXCLUSIVA", exclusiva);
        this.exclusiva = exclusiva;
   }

   public String getImpBoleta() {
        return impBoleta;
   }

   public void setImpBoleta(String impBoleta) {
        markAsChanged("IMPBOLETA", impBoleta);
        this.impBoleta = impBoleta;
   }

   public BigDecimal getInstrucaoI() {
        return instrucaoI;
   }

   public void setInstrucaoI(BigDecimal instrucaoI) {
        markAsChanged("INSTRUCAOI", instrucaoI);
        this.instrucaoI = instrucaoI;
   }

   public BigDecimal getInstrucaoII() {
        return instrucaoII;
   }

   public void setInstrucaoII(BigDecimal instrucaoII) {
        markAsChanged("INSTRUCAOII", instrucaoII);
        this.instrucaoII = instrucaoII;
   }

   public BigDecimal getModalidade() {
        return modalidade;
   }

   public void setModalidade(BigDecimal modalidade) {
        markAsChanged("MODALIDADE", modalidade);
        this.modalidade = modalidade;
   }

   public BigDecimal getModBoleta() {
        return modBoleta;
   }

   public void setModBoleta(BigDecimal modBoleta) {
        markAsChanged("MODBOLETA", modBoleta);
        this.modBoleta = modBoleta;
   }

   public BigDecimal getNumCheq() {
        return numCheq;
   }

   public void setNumCheq(BigDecimal numCheq) {
        markAsChanged("NUMCHEQ", numCheq);
        this.numCheq = numCheq;
   }

   public BigDecimal getNuRfeModCheqG() {
        return nuRfeModCheqG;
   }

   public void setNuRfeModCheqG(BigDecimal nuRfeModCheqG) {
        markAsChanged("NURFEMODCHEQG", nuRfeModCheqG);
        this.nuRfeModCheqG = nuRfeModCheqG;
   }

   public BigDecimal getRemBco() {
        return remBco;
   }

   public void setRemBco(BigDecimal remBco) {
        markAsChanged("REMBCO", remBco);
        this.remBco = remBco;
   }

   public BigDecimal getRemBcoMax() {
        return remBcoMax;
   }

   public void setRemBcoMax(BigDecimal remBcoMax) {
        markAsChanged("REMBCOMAX", remBcoMax);
        this.remBcoMax = remBcoMax;
   }

   public BigDecimal getRemFinal() {
        return remFinal;
   }

   public void setRemFinal(BigDecimal remFinal) {
        markAsChanged("REMFINAL", remFinal);
        this.remFinal = remFinal;
   }

   public BigDecimal getRemFinal2() {
        return remFinal2;
   }

   public void setRemFinal2(BigDecimal remFinal2) {
        markAsChanged("REMFINAL2", remFinal2);
        this.remFinal2 = remFinal2;
   }

   public BigDecimal getSaldoBco() {
        return saldoBco;
   }

   public void setSaldoBco(BigDecimal saldoBco) {
        markAsChanged("SALDOBCO", saldoBco);
        this.saldoBco = saldoBco;
   }

   public String getContabilizarDias() {
        return contabilizarDias;
   }

   public void setContabilizarDias(String contabilizarDias) {
        markAsChanged("CONTABILIZARDIAS", contabilizarDias);
        this.contabilizarDias = contabilizarDias;
   }

   public BigDecimal getIdSeqBol() {
        return idSeqBol;
   }

   public void setIdSeqBol(BigDecimal idSeqBol) {
        markAsChanged("IDSEQBOL", idSeqBol);
        this.idSeqBol = idSeqBol;
   }

   public BigDecimal getInstrucaoNegativacao() {
        return instrucaoNegativacao;
   }

   public void setInstrucaoNegativacao(BigDecimal instrucaoNegativacao) {
        markAsChanged("INSTRUCAONEGATIVACAO", instrucaoNegativacao);
        this.instrucaoNegativacao = instrucaoNegativacao;
   }

   public BigDecimal getInstrucaoProtesto() {
        return instrucaoProtesto;
   }

   public void setInstrucaoProtesto(BigDecimal instrucaoProtesto) {
        markAsChanged("INSTRUCAOPROTESTO", instrucaoProtesto);
        this.instrucaoProtesto = instrucaoProtesto;
   }

   public String getDesConsLcdPr() {
        return desConsLcdPr;
   }

   public void setDesConsLcdPr(String desConsLcdPr) {
        markAsChanged("DESCONSLCDPR", desConsLcdPr);
        this.desConsLcdPr = desConsLcdPr;
   }

   public String getNumContaRural() {
        return numContaRural;
   }

   public void setNumContaRural(String numContaRural) {
        markAsChanged("NUMCONTARURAL", numContaRural);
        this.numContaRural = numContaRural;
   }

   public String getChavePix() {
        return chavePix;
   }

   public void setChavePix(String chavePix) {
        markAsChanged("CHAVEPIX", chavePix);
        this.chavePix = chavePix;
   }

   public BigDecimal getQtdDiasValPix() {
        return qtdDiasValPix;
   }

   public void setQtdDiasValPix(BigDecimal qtdDiasValPix) {
        markAsChanged("QTDDIASVALPIX", qtdDiasValPix);
        this.qtdDiasValPix = qtdDiasValPix;
   }

   public String getUrlPix() {
        return urlPix;
   }

   public void setUrlPix(String urlPix) {
        markAsChanged("URLPIX", urlPix);
        this.urlPix = urlPix;
   }

   public String getChaveApiPix() {
        return chaveApiPix;
   }

   public void setChaveApiPix(String chaveApiPix) {
        markAsChanged("CHAVEAPIPIX", chaveApiPix);
        this.chaveApiPix = chaveApiPix;
   }

   public String getConcAutRecebPix() {
        return concAutRecebPix;
   }

   public void setConcAutRecebPix(String concAutRecebPix) {
        markAsChanged("CONCAUTRECEBPIX", concAutRecebPix);
        this.concAutRecebPix = concAutRecebPix;
   }

   public String getIdCliPix() {
        return idCliPix;
   }

   public void setIdCliPix(String idCliPix) {
        markAsChanged("IDCLIPIX", idCliPix);
        this.idCliPix = idCliPix;
   }

   public String getMenAdicPix() {
        return menAdicPix;
   }

   public void setMenAdicPix(String menAdicPix) {
        markAsChanged("MENADICPIX", menAdicPix);
        this.menAdicPix = menAdicPix;
   }

   public BigDecimal getNuRfeModBoleto() {
        return nuRfeModBoleto;
   }

   public void setNuRfeModBoleto(BigDecimal nuRfeModBoleto) {
        markAsChanged("NURFEMODBOLETO", nuRfeModBoleto);
        this.nuRfeModBoleto = nuRfeModBoleto;
   }

   public String getSenCliPix() {
        return senCliPix;
   }

   public void setSenCliPix(String senCliPix) {
        markAsChanged("SENCLIPIX", senCliPix);
        this.senCliPix = senCliPix;
   }

   public String getTitInfAdicPix() {
        return titInfAdicPix;
   }

   public void setTitInfAdicPix(String titInfAdicPix) {
        markAsChanged("TITINFADICPIX", titInfAdicPix);
        this.titInfAdicPix = titInfAdicPix;
   }

   public String getLogoUrl() {
        return logoUrl;
   }

   public void setLogoUrl(String logoUrl) {
        markAsChanged("LOGOURL", logoUrl);
        this.logoUrl = logoUrl;
   }

   public Timestamp getDtEnvioApiBanco() {
        return dtEnvioApiBanco;
   }

   public void setDtEnvioApiBanco(Timestamp dtEnvioApiBanco) {
        markAsChanged("DTENVIOAPIBANCO", dtEnvioApiBanco);
        this.dtEnvioApiBanco = dtEnvioApiBanco;
   }

   public String getAceitaTituloVencido() {
        return aceitaTituloVencido;
   }

   public void setAceitaTituloVencido(String aceitaTituloVencido) {
        markAsChanged("ACEITATITULOVENCIDO", aceitaTituloVencido);
        this.aceitaTituloVencido = aceitaTituloVencido;
   }

   public String getApiBaixaAutomatica() {
        return apiBaixaAutomatica;
   }

   public void setApiBaixaAutomatica(String apiBaixaAutomatica) {
        markAsChanged("APIBAIXAAUTOMATICA", apiBaixaAutomatica);
        this.apiBaixaAutomatica = apiBaixaAutomatica;
   }

   public String getApiConciliacaoAutomatica() {
        return apiConciliacaoAutomatica;
   }

   public void setApiConciliacaoAutomatica(String apiConciliacaoAutomatica) {
        markAsChanged("APICONCILIACAOAUTOMATICA", apiConciliacaoAutomatica);
        this.apiConciliacaoAutomatica = apiConciliacaoAutomatica;
   }

   public String getDataMulta() {
        return dataMulta;
   }

   public void setDataMulta(String dataMulta) {
        markAsChanged("DATAMULTA", dataMulta);
        this.dataMulta = dataMulta;
   }

   public BigDecimal getDiasMulta() {
        return diasMulta;
   }

   public void setDiasMulta(BigDecimal diasMulta) {
        markAsChanged("DIASMULTA", diasMulta);
        this.diasMulta = diasMulta;
   }

   public BigDecimal getDiasParaNegativacao() {
        return diasParaNegativacao;
   }

   public void setDiasParaNegativacao(BigDecimal diasParaNegativacao) {
        markAsChanged("DIASPARANEGATIVACAO", diasParaNegativacao);
        this.diasParaNegativacao = diasParaNegativacao;
   }

   public BigDecimal getDiasProtesto() {
        return diasProtesto;
   }

   public void setDiasProtesto(BigDecimal diasProtesto) {
        markAsChanged("DIASPROTESTO", diasProtesto);
        this.diasProtesto = diasProtesto;
   }

   public Timestamp getDtRegConta() {
        return dtRegConta;
   }

   public void setDtRegConta(Timestamp dtRegConta) {
        markAsChanged("DTREGCONTA", dtRegConta);
        this.dtRegConta = dtRegConta;
   }

   public BigDecimal getIdApiBanco() {
        return idApiBanco;
   }

   public void setIdApiBanco(BigDecimal idApiBanco) {
        markAsChanged("IDAPIBANCO", idApiBanco);
        this.idApiBanco = idApiBanco;
   }

   public String getIndicadorPix() {
        return indicadorPix;
   }

   public void setIndicadorPix(String indicadorPix) {
        markAsChanged("INDICADORPIX", indicadorPix);
        this.indicadorPix = indicadorPix;
   }

   public BigDecimal getOrgaoNegativador() {
        return orgaoNegativador;
   }

   public void setOrgaoNegativador(BigDecimal orgaoNegativador) {
        markAsChanged("ORGAONEGATIVADOR", orgaoNegativador);
        this.orgaoNegativador = orgaoNegativador;
   }

   public BigDecimal getRecebimentoDias() {
        return recebimentoDias;
   }

   public void setRecebimentoDias(BigDecimal recebimentoDias) {
        markAsChanged("RECEBIMENTODIAS", recebimentoDias);
        this.recebimentoDias = recebimentoDias;
   }

   public String getRecebimentoParcial() {
        return recebimentoParcial;
   }

   public void setRecebimentoParcial(String recebimentoParcial) {
        markAsChanged("RECEBIMENTOPARCIAL", recebimentoParcial);
        this.recebimentoParcial = recebimentoParcial;
   }

   public String getStatusApi() {
        return statusApi;
   }

   public void setStatusApi(String statusApi) {
        markAsChanged("STATUSAPI", statusApi);
        this.statusApi = statusApi;
   }

   public String getTipoApiBoleto() {
        return tipoApiBoleto;
   }

   public void setTipoApiBoleto(String tipoApiBoleto) {
        markAsChanged("TIPOAPIBOLETO", tipoApiBoleto);
        this.tipoApiBoleto = tipoApiBoleto;
   }

   public String getTipoJuros() {
        return tipoJuros;
   }

   public void setTipoJuros(String tipoJuros) {
        markAsChanged("TIPOJUROS", tipoJuros);
        this.tipoJuros = tipoJuros;
   }

   public String getTipoMulta() {
        return tipoMulta;
   }

   public void setTipoMulta(String tipoMulta) {
        markAsChanged("TIPOMULTA", tipoMulta);
        this.tipoMulta = tipoMulta;
   }

   public BigDecimal getValorJuros() {
        return valorJuros;
   }

   public void setValorJuros(BigDecimal valorJuros) {
        markAsChanged("VALORJUROS", valorJuros);
        this.valorJuros = valorJuros;
   }

   public BigDecimal getValorMulta() {
        return valorMulta;
   }

   public void setValorMulta(BigDecimal valorMulta) {
        markAsChanged("VALORMULTA", valorMulta);
        this.valorMulta = valorMulta;
   }

   public BigDecimal getVariacao() {
        return variacao;
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
        this.variacao = variacao;
   }

   public String getUtilizaPixPdv() {
        return utilizaPixPdv;
   }

   public void setUtilizaPixPdv(String utilizaPixPdv) {
        markAsChanged("UTILIZAPIXPDV", utilizaPixPdv);
        this.utilizaPixPdv = utilizaPixPdv;
   }

   public Timestamp getDtDescRedConta() {
        return dtDescRedConta;
   }

   public void setDtDescRedConta(Timestamp dtDescRedConta) {
        markAsChanged("DTDESCREDCONTA", dtDescRedConta);
        this.dtDescRedConta = dtDescRedConta;
   }

   public String getDataJuro() {
        return dataJuro;
   }

   public void setDataJuro(String dataJuro) {
        markAsChanged("DATAJURO", dataJuro);
        this.dataJuro = dataJuro;
   }

   public BigDecimal getDiasJuro() {
        return diasJuro;
   }

   public void setDiasJuro(BigDecimal diasJuro) {
        markAsChanged("DIASJURO", diasJuro);
        this.diasJuro = diasJuro;
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
        this.setOriginalVO(vo);
        this.codAgeBenef = vo.asBigDecimal("CODAGEBENEF");
        this.codCtaBenef = vo.asBigDecimal("CODCTABENEF");
        this.idCliente = vo.asString("IDCLIENTE");
        this.saldoReal = vo.asBigDecimal("SALDOREAL");
        this.seqRem = vo.asBigDecimal("SEQREM");
        this.seqRem2 = vo.asBigDecimal("SEQREM2");
        this.taxa = vo.asBigDecimal("TAXA");
        this.tipoImpressora = vo.asString("TIPOIMPRESSORA");
        this.vlrMinBoleta = vo.asBigDecimal("VLRMINBOLETA");
        this.zerarAut = vo.asString("ZERARAUT");
        this.numCliente = vo.asBigDecimal("NUMCLIENTE");
        this.bjbbaiBolPag = vo.asString("BJBBAIBOLPAG");
        this.codCtaBaixa = vo.asBigDecimal("CODCTABAIXA");
        this.codLancBaixaBolRap = vo.asBigDecimal("CODLANCBAIXABOLRAP");
        this.codTipOperBaixaBolRap = vo.asBigDecimal("CODTIPOPERBAIXABOLRAP");
        this.pjbChave = vo.asString("PJBCHAVE");
        this.pjbConBaixCred = vo.asString("PJBCONBAIXCRED");
        this.pjbCred = vo.asString("PJBCRED");
        this.tipoBoleto = vo.asString("TIPOBOLETO");
        this.nuContrato = vo.asBigDecimal("NUCONTRATO");
        this.campoLivre = vo.asString("CAMPOLIVRE");
        this.restoSubst2 = vo.asBigDecimal("RESTOSUBST2");
        this.digitoSubst1 = vo.asString("DIGITOSUBST1");
        this.restoSubst3 = vo.asBigDecimal("RESTOSUBST3");
        this.restoSubst1 = vo.asBigDecimal("RESTOSUBST1");
        this.subRestModulo = vo.asString("SUBRESTMODULO");
        this.tipMultipSoma = vo.asString("TIPMULTIPSOMA");
        this.ativa = vo.asString("ATIVA");
        this.carteira = vo.asBigDecimal("CARTEIRA");
        this.categLanChq = vo.asBigDecimal("CATEGLANCHQ");
        this.classe = vo.asString("CLASSE");
        this.codAge = vo.asString("CODAGE");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.codCorrBco = vo.asBigDecimal("CODCORRBCO");
        this.codCtaBco = vo.asString("CODCTABCO");
        this.codCtaBcoInt = vo.asBigDecimal("CODCTABCOINT");
        this.codCtaBcoIntRem = vo.asBigDecimal("CODCTABCOINTREM");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codOperExcl = vo.asBigDecimal("CODOPEREXCL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codContaRural = vo.asString("CODCONTARURAL");
        this.multipNossoNum = vo.asString("MULTIPNOSSONUM");
        this.digitoSubst3 = vo.asString("DIGITOSUBST3");
        this.nossoNumero = vo.asString("NOSSONUMERO");
        this.tipModNossoNum = vo.asString("TIPMODNOSSNUM");
        this.digitoSubst2 = vo.asString("DIGITOSUBST2");
        this.nossoNumAtivo = vo.asString("NOSSONUMATIVO");
        this.linhaDigAtivo = vo.asString("LINHADIGATIVO");
        this.convenio = vo.asBigDecimal("CONVENIO");
        this.ctaDefEmiBol = vo.asString("CTADEFEMIBOL");
        this.ctaMinBoleta = vo.asBigDecimal("CTAMINBOLETA");
        this.descricao = vo.asString("DESCRICAO");
        this.diasProt = vo.asBigDecimal("DIASPROT");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtImplant = vo.asTimestamp("DTIMPLANT");
        this.emiteBoleta = vo.asString("EMITEBOLETA");
        this.exclusiva = vo.asString("EXCLUSIVA");
        this.impBoleta = vo.asString("IMPBOLETA");
        this.instrucaoI = vo.asBigDecimal("INSTRUCAOI");
        this.instrucaoII = vo.asBigDecimal("INSTRUCAOII");
        this.modalidade = vo.asBigDecimal("MODALIDADE");
        this.modBoleta = vo.asBigDecimal("MODBOLETA");
        this.numCheq = vo.asBigDecimal("NUMCHEQ");
        this.nuRfeModCheqG = vo.asBigDecimal("NURFEMODCHEQG");
        this.remBco = vo.asBigDecimal("REMBCO");
        this.remBcoMax = vo.asBigDecimal("REMBCOMAX");
        this.remFinal = vo.asBigDecimal("REMFINAL");
        this.remFinal2 = vo.asBigDecimal("REMFINAL2");
        this.saldoBco = vo.asBigDecimal("SALDOBCO");
        this.contabilizarDias = vo.asString("CONTABILIZARDIAS");
        this.idSeqBol = vo.asBigDecimal("IDSEQBOL");
        this.instrucaoNegativacao = vo.asBigDecimal("INSTRUCAONEGATIVACAO");
        this.instrucaoProtesto = vo.asBigDecimal("INSTRUCAOPROTESTO");
        this.desConsLcdPr = vo.asString("DESCONSLCDPR");
        this.numContaRural = vo.asString("NUMCONTARURAL");
        this.chavePix = vo.asString("CHAVEPIX");
        this.qtdDiasValPix = vo.asBigDecimal("QTDDIASVALPIX");
        this.urlPix = vo.asString("URLPIX");
        this.chaveApiPix = vo.asString("CHAVEAPIPIX");
        this.concAutRecebPix = vo.asString("CONCAUTRECEBPIX");
        this.idCliPix = vo.asString("IDCLIPIX");
        this.menAdicPix = vo.asString("MENADICPIX");
        this.nuRfeModBoleto = vo.asBigDecimal("NURFEMODBOLETO");
        this.senCliPix = vo.asString("SENCLIPIX");
        this.titInfAdicPix = vo.asString("TITINFADICPIX");
        this.logoUrl = vo.asString("LOGOURL");
        this.dtEnvioApiBanco = vo.asTimestamp("DTENVIOAPIBANCO");
        this.aceitaTituloVencido = vo.asString("ACEITATITULOVENCIDO");
        this.apiBaixaAutomatica = vo.asString("APIBAIXAAUTOMATICA");
        this.apiConciliacaoAutomatica = vo.asString("APICONCILIACAOAUTOMATICA");
        this.dataMulta = vo.asString("DATAMULTA");
        this.diasMulta = vo.asBigDecimal("DIASMULTA");
        this.diasParaNegativacao = vo.asBigDecimal("DIASPARANEGATIVACAO");
        this.diasProtesto = vo.asBigDecimal("DIASPROTESTO");
        this.dtRegConta = vo.asTimestamp("DTREGCONTA");
        this.idApiBanco = vo.asBigDecimal("IDAPIBANCO");
        this.indicadorPix = vo.asString("INDICADORPIX");
        this.orgaoNegativador = vo.asBigDecimal("ORGAONEGATIVADOR");
        this.recebimentoDias = vo.asBigDecimal("RECEBIMENTODIAS");
        this.recebimentoParcial = vo.asString("RECEBIMENTOPARCIAL");
        this.statusApi = vo.asString("STATUSAPI");
        this.tipoApiBoleto = vo.asString("TIPOAPIBOLETO");
        this.tipoJuros = vo.asString("TIPOJUROS");
        this.tipoMulta = vo.asString("TIPOMULTA");
        this.valorJuros = vo.asBigDecimal("VALORJUROS");
        this.valorMulta = vo.asBigDecimal("VALORMULTA");
        this.variacao = vo.asBigDecimal("VARIACAO");
        this.utilizaPixPdv = vo.asString("UTILIZAPIXPDV");
        this.dtDescRedConta = vo.asTimestamp("DTDESCREDCONTA");
        this.dataJuro = vo.asString("DATAJURO");
        this.diasJuro = vo.asBigDecimal("DIASJURO");
        return this;
   }
}
