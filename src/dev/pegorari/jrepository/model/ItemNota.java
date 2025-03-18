package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemNota extends AbstractSankhyaEntity<ItemNota> {
   private BigDecimal aliqIcms;
   private BigDecimal aliqIcmsRed;
   private BigDecimal aliqIpi;
   private BigDecimal aliqIss;
   private BigDecimal vlrIcmsUfDest;
   private BigDecimal vlrIpi;
   private BigDecimal vlrIss;
   private BigDecimal vlrLiqProm;
   private BigDecimal vlrPromo;
   private BigDecimal vlrPtoPureza;
   private BigDecimal vlrRepRed;
   private BigDecimal vlrRetencao;
   private BigDecimal vlrStExtraNota;
   private BigDecimal vlrSubst;
   private BigDecimal vlrSubstAnt;
   private BigDecimal vlrSugerido;
   private BigDecimal vlrTot;
   private BigDecimal vlrTotLiq;
   private BigDecimal vlrTroca;
   private BigDecimal vlrUnidPad;
   private BigDecimal vlrUnit;
   private BigDecimal vlrUnitDolar;
   private BigDecimal vlrUnitLiq;
   private BigDecimal vlrDescBonif;
   private BigDecimal basicmMod;
   private BigDecimal basicmStMod;
   private String codAntecipSt;
   private BigDecimal numeroOs;
   private BigDecimal atualEstoque;
   private String atualEstTerc;
   private BigDecimal baseIcms;
   private BigDecimal baseIpi;
   private BigDecimal baseIss;
   private BigDecimal baseStAnt;
   private BigDecimal baseStUfDest;
   private BigDecimal baseSubstit;
   private BigDecimal vlrDescDigitado;
   private BigDecimal vlrIcms;
   private BigDecimal vlrIcmsAnt;
   private String terceiros;
   private String usoProd;
   private BigDecimal variacaoFcp;
   private BigDecimal vlrAcrescDesc;
   private BigDecimal vlrCom;
   private BigDecimal vlrComGer;
   private BigDecimal vlrCus;
   private String codVolParc;
   private BigDecimal vlrDesc;
   private BigDecimal vlrTotLiqMoe;
   private BigDecimal vlrTotMoe;
   private BigDecimal vlrDescMoe;
   private BigDecimal vlrUnitMoe;
   private BigDecimal codEspecSt;
   private BigDecimal idAliqIcms;
   private BigDecimal numContrato;
   private BigDecimal vlrUnitLoc;
   private BigDecimal codEnqIpi;
   private BigDecimal vlrUnitLiqMoe;
   private BigDecimal baseSubstitAnt;
   private BigDecimal baseSubstitSemRed;
   private BigDecimal codCav;
   private BigDecimal codCfo;
   private BigDecimal codCfps;
   private BigDecimal codEmp;
   private BigDecimal codExec;
   private BigDecimal codLocalDest;
   private BigDecimal codLocalOrig;
   private BigDecimal codMotDesoneraIcms;
   private BigDecimal codObsPadrao;
   private BigDecimal codParceExec;
   private BigDecimal codProc;
   private BigDecimal codProd;
   private BigDecimal codPromo;
   private BigDecimal codTpa;
   private BigDecimal codTrib;
   private BigDecimal codTribIss;
   private BigDecimal codUsu;
   private BigDecimal codVend;
   private String codVol;
   private String codVolPad;
   private String complDesc;
   private String controle;
   private String controleDest;
   private BigDecimal csosn;
   private BigDecimal cstIpi;
   private BigDecimal custo;
   private Timestamp dtAlter;
   private Timestamp dtVigor;
   private String endImagem;
   private BigDecimal espessura;
   private BigDecimal estoque;
   private String faturar;
   private BigDecimal grupoTransg;
   private String gtinNfe;
   private String gtinTribNfe;
   private BigDecimal largura;
   private BigDecimal m3;
   private String marca;
   private String ncm;
   private String nrSerieReserva;
   private String numPedido2;
   private BigDecimal nuNota;
   private BigDecimal nuPromocao;
   private BigDecimal nuTab;
   private String observacao;
   private String origProd;
   private String pendente;
   private BigDecimal percCom;
   private BigDecimal percComGer;
   private BigDecimal percDesc;
   private BigDecimal percDescBase;
   private BigDecimal percDescBonif;
   private BigDecimal percDescDigitado;
   private BigDecimal percDescProm;
   private BigDecimal percDescTgfdes;
   private BigDecimal percGermin;
   private BigDecimal percPureza;
   private BigDecimal pesoBruto;
   private BigDecimal pesoLiq;
   private BigDecimal precoBase;
   private BigDecimal precoBaseQtd;
   private String produtoNfe;
   private BigDecimal qtdConferida;
   private BigDecimal qtdEntregue;
   private BigDecimal qtdFat;
   private BigDecimal qtdFixada;
   private BigDecimal qtdFormula;
   private BigDecimal qtdNeg;
   private BigDecimal qtdPeca;
   private BigDecimal qtdPendente;
   private BigDecimal qtdUnidPad;
   private BigDecimal qtdWms;
   private String referencia;
   private String refForn;
   private String reserva;
   private String seqPedido2;
   private BigDecimal sequencia;
   private String solCompra;
   private String statusLote;
   private String statusNota;
   private String altPreco;
   private BigDecimal altura;
   private BigDecimal qtdVol;
   private Timestamp dtInicio;
   private BigDecimal aliqStExtraNota;
   private BigDecimal aliqStFcpStAnt;
   private BigDecimal baseStExtraNota;
   private String origemBusca;
   private BigDecimal produtoPesquisado;
   private BigDecimal qtdTribExport;
   private BigDecimal reservado;
   private BigDecimal vlrRepRedSemDesc;
   private BigDecimal vlrTotLiqRef;
   private BigDecimal vlrVendaPromo;
   private BigDecimal nuFop;
   private BigDecimal sequenciaFiscal;
   private BigDecimal codLocalTerc;
   private BigDecimal percStFcpIntAnt;
   private BigDecimal vlrStFcpIntAnt;
   private BigDecimal baseStFcpIntAnt;
   private String indEscala;
   private String codBenefNauf;
   private String cnpjFabricante;
   private String codAgregacao;
   private BigDecimal percRedVlrIpi;
   private BigDecimal codDocArrecad;
   private String numDocArrecad;
   private BigDecimal baseCalcStExtraNota;
   private BigDecimal margLucro;
   private BigDecimal redBaseSt;
   private BigDecimal vlrIcmsDiferido;
   private String tipoSeparacao;
   private String nroProcesso;
   private BigDecimal baseSubstitUnitOrig;
   private BigDecimal vlrSubstitUnitOrig;
   private BigDecimal percDescFornecedor;
   private String statusProc;
   private String operAtual;
   private String geraProducao;
   private BigDecimal icmsStFrete;
   private BigDecimal idAliqIcmsDifIcms;
   private String codBarraPdv;
   private BigDecimal aliqFetHab;
   private BigDecimal vlrFetHab;
   private String codSit08Efd;
   private BigDecimal aliqFuntTel;
   private BigDecimal aliqFust;
   private BigDecimal baseFuntTel;
   private BigDecimal baseFust;
   private BigDecimal vlrFuntTel;
   private BigDecimal vlrFust;
   private BigDecimal tipUtilCom;
   private BigDecimal percUsaquDecpe;
   private BigDecimal vlrCusAquDecpe;
   private BigDecimal baseIcmsStFrete;
   private BigDecimal codMotDesoneraSt;
   private BigDecimal vlrRepRedSt;
   private String unidade;
   private String tipEntrega;
   private BigDecimal aliqIcmsAt;
   private BigDecimal aliqInterIcmsAt;
   private BigDecimal baseIcmsAt;
   private BigDecimal idAliqIcmsAt;
   private BigDecimal vlrIcmsAt;
   private BigDecimal idDescParceria;
   private BigDecimal vlrDescParceria;
   private String codFci;
   private BigDecimal percUsaquDecpeEst;
   private BigDecimal codIpi;
   private BigDecimal idAliqIss;
   private BigDecimal codNatRend;
   private String indRepDes;

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getAliqIcmsRed() {
        return aliqIcmsRed;
   }

   public void setAliqIcmsRed(BigDecimal aliqIcmsRed) {
        markAsChanged("ALIQICMSRED", aliqIcmsRed);
        this.aliqIcmsRed = aliqIcmsRed;
   }

   public BigDecimal getAliqIpi() {
        return aliqIpi;
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        markAsChanged("ALIQIPI", aliqIpi);
        this.aliqIpi = aliqIpi;
   }

   public BigDecimal getAliqIss() {
        return aliqIss;
   }

   public void setAliqIss(BigDecimal aliqIss) {
        markAsChanged("ALIQISS", aliqIss);
        this.aliqIss = aliqIss;
   }

   public BigDecimal getVlrIcmsUfDest() {
        return vlrIcmsUfDest;
   }

   public void setVlrIcmsUfDest(BigDecimal vlrIcmsUfDest) {
        markAsChanged("VLRICMSUFDEST", vlrIcmsUfDest);
        this.vlrIcmsUfDest = vlrIcmsUfDest;
   }

   public BigDecimal getVlrIpi() {
        return vlrIpi;
   }

   public void setVlrIpi(BigDecimal vlrIpi) {
        markAsChanged("VLRIPI", vlrIpi);
        this.vlrIpi = vlrIpi;
   }

   public BigDecimal getVlrIss() {
        return vlrIss;
   }

   public void setVlrIss(BigDecimal vlrIss) {
        markAsChanged("VLRISS", vlrIss);
        this.vlrIss = vlrIss;
   }

   public BigDecimal getVlrLiqProm() {
        return vlrLiqProm;
   }

   public void setVlrLiqProm(BigDecimal vlrLiqProm) {
        markAsChanged("VLRLIQPROM", vlrLiqProm);
        this.vlrLiqProm = vlrLiqProm;
   }

   public BigDecimal getVlrPromo() {
        return vlrPromo;
   }

   public void setVlrPromo(BigDecimal vlrPromo) {
        markAsChanged("VLRPROMO", vlrPromo);
        this.vlrPromo = vlrPromo;
   }

   public BigDecimal getVlrPtoPureza() {
        return vlrPtoPureza;
   }

   public void setVlrPtoPureza(BigDecimal vlrPtoPureza) {
        markAsChanged("VLRPTOPUREZA", vlrPtoPureza);
        this.vlrPtoPureza = vlrPtoPureza;
   }

   public BigDecimal getVlrRepRed() {
        return vlrRepRed;
   }

   public void setVlrRepRed(BigDecimal vlrRepRed) {
        markAsChanged("VLRREPRED", vlrRepRed);
        this.vlrRepRed = vlrRepRed;
   }

   public BigDecimal getVlrRetencao() {
        return vlrRetencao;
   }

   public void setVlrRetencao(BigDecimal vlrRetencao) {
        markAsChanged("VLRRETENCAO", vlrRetencao);
        this.vlrRetencao = vlrRetencao;
   }

   public BigDecimal getVlrStExtraNota() {
        return vlrStExtraNota;
   }

   public void setVlrStExtraNota(BigDecimal vlrStExtraNota) {
        markAsChanged("VLRSTEXTRANOTA", vlrStExtraNota);
        this.vlrStExtraNota = vlrStExtraNota;
   }

   public BigDecimal getVlrSubst() {
        return vlrSubst;
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
        this.vlrSubst = vlrSubst;
   }

   public BigDecimal getVlrSubstAnt() {
        return vlrSubstAnt;
   }

   public void setVlrSubstAnt(BigDecimal vlrSubstAnt) {
        markAsChanged("VLRSUBSTANT", vlrSubstAnt);
        this.vlrSubstAnt = vlrSubstAnt;
   }

   public BigDecimal getVlrSugerido() {
        return vlrSugerido;
   }

   public void setVlrSugerido(BigDecimal vlrSugerido) {
        markAsChanged("VLRSUGERIDO", vlrSugerido);
        this.vlrSugerido = vlrSugerido;
   }

   public BigDecimal getVlrTot() {
        return vlrTot;
   }

   public void setVlrTot(BigDecimal vlrTot) {
        markAsChanged("VLRTOT", vlrTot);
        this.vlrTot = vlrTot;
   }

   public BigDecimal getVlrTotLiq() {
        return vlrTotLiq;
   }

   public void setVlrTotLiq(BigDecimal vlrTotLiq) {
        markAsChanged("VLRTOTLIQ", vlrTotLiq);
        this.vlrTotLiq = vlrTotLiq;
   }

   public BigDecimal getVlrTroca() {
        return vlrTroca;
   }

   public void setVlrTroca(BigDecimal vlrTroca) {
        markAsChanged("VLRTROCA", vlrTroca);
        this.vlrTroca = vlrTroca;
   }

   public BigDecimal getVlrUnidPad() {
        return vlrUnidPad;
   }

   public void setVlrUnidPad(BigDecimal vlrUnidPad) {
        markAsChanged("VLRUNIDPAD", vlrUnidPad);
        this.vlrUnidPad = vlrUnidPad;
   }

   public BigDecimal getVlrUnit() {
        return vlrUnit;
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        markAsChanged("VLRUNIT", vlrUnit);
        this.vlrUnit = vlrUnit;
   }

   public BigDecimal getVlrUnitDolar() {
        return vlrUnitDolar;
   }

   public void setVlrUnitDolar(BigDecimal vlrUnitDolar) {
        markAsChanged("VLRUNITDOLAR", vlrUnitDolar);
        this.vlrUnitDolar = vlrUnitDolar;
   }

   public BigDecimal getVlrUnitLiq() {
        return vlrUnitLiq;
   }

   public void setVlrUnitLiq(BigDecimal vlrUnitLiq) {
        markAsChanged("VLRUNITLIQ", vlrUnitLiq);
        this.vlrUnitLiq = vlrUnitLiq;
   }

   public BigDecimal getVlrDescBonif() {
        return vlrDescBonif;
   }

   public void setVlrDescBonif(BigDecimal vlrDescBonif) {
        markAsChanged("VLRDESCBONIF", vlrDescBonif);
        this.vlrDescBonif = vlrDescBonif;
   }

   public BigDecimal getBasicmMod() {
        return basicmMod;
   }

   public void setBasicmMod(BigDecimal basicmMod) {
        markAsChanged("BASICMMOD", basicmMod);
        this.basicmMod = basicmMod;
   }

   public BigDecimal getBasicmStMod() {
        return basicmStMod;
   }

   public void setBasicmStMod(BigDecimal basicmStMod) {
        markAsChanged("BASICMSTMOD", basicmStMod);
        this.basicmStMod = basicmStMod;
   }

   public String getCodAntecipSt() {
        return codAntecipSt;
   }

   public void setCodAntecipSt(String codAntecipSt) {
        markAsChanged("CODANTECIPST", codAntecipSt);
        this.codAntecipSt = codAntecipSt;
   }

   public BigDecimal getNumeroOs() {
        return numeroOs;
   }

   public void setNumeroOs(BigDecimal numeroOs) {
        markAsChanged("NUMEROOS", numeroOs);
        this.numeroOs = numeroOs;
   }

   public BigDecimal getAtualEstoque() {
        return atualEstoque;
   }

   public void setAtualEstoque(BigDecimal atualEstoque) {
        markAsChanged("ATUALESTOQUE", atualEstoque);
        this.atualEstoque = atualEstoque;
   }

   public String getAtualEstTerc() {
        return atualEstTerc;
   }

   public void setAtualEstTerc(String atualEstTerc) {
        markAsChanged("ATUALESTTERC", atualEstTerc);
        this.atualEstTerc = atualEstTerc;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
        this.baseIcms = baseIcms;
   }

   public BigDecimal getBaseIpi() {
        return baseIpi;
   }

   public void setBaseIpi(BigDecimal baseIpi) {
        markAsChanged("BASEIPI", baseIpi);
        this.baseIpi = baseIpi;
   }

   public BigDecimal getBaseIss() {
        return baseIss;
   }

   public void setBaseIss(BigDecimal baseIss) {
        markAsChanged("BASEISS", baseIss);
        this.baseIss = baseIss;
   }

   public BigDecimal getBaseStAnt() {
        return baseStAnt;
   }

   public void setBaseStAnt(BigDecimal baseStAnt) {
        markAsChanged("BASESTANT", baseStAnt);
        this.baseStAnt = baseStAnt;
   }

   public BigDecimal getBaseStUfDest() {
        return baseStUfDest;
   }

   public void setBaseStUfDest(BigDecimal baseStUfDest) {
        markAsChanged("BASESTUFDEST", baseStUfDest);
        this.baseStUfDest = baseStUfDest;
   }

   public BigDecimal getBaseSubstit() {
        return baseSubstit;
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
        this.baseSubstit = baseSubstit;
   }

   public BigDecimal getVlrDescDigitado() {
        return vlrDescDigitado;
   }

   public void setVlrDescDigitado(BigDecimal vlrDescDigitado) {
        markAsChanged("VLRDESCDIGITADO", vlrDescDigitado);
        this.vlrDescDigitado = vlrDescDigitado;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrIcmsAnt() {
        return vlrIcmsAnt;
   }

   public void setVlrIcmsAnt(BigDecimal vlrIcmsAnt) {
        markAsChanged("VLRICMSANT", vlrIcmsAnt);
        this.vlrIcmsAnt = vlrIcmsAnt;
   }

   public String getTerceiros() {
        return terceiros;
   }

   public void setTerceiros(String terceiros) {
        markAsChanged("TERCEIROS", terceiros);
        this.terceiros = terceiros;
   }

   public String getUsoProd() {
        return usoProd;
   }

   public void setUsoProd(String usoProd) {
        markAsChanged("USOPROD", usoProd);
        this.usoProd = usoProd;
   }

   public BigDecimal getVariacaoFcp() {
        return variacaoFcp;
   }

   public void setVariacaoFcp(BigDecimal variacaoFcp) {
        markAsChanged("VARIACAOFCP", variacaoFcp);
        this.variacaoFcp = variacaoFcp;
   }

   public BigDecimal getVlrAcrescDesc() {
        return vlrAcrescDesc;
   }

   public void setVlrAcrescDesc(BigDecimal vlrAcrescDesc) {
        markAsChanged("VLRACRESCDESC", vlrAcrescDesc);
        this.vlrAcrescDesc = vlrAcrescDesc;
   }

   public BigDecimal getVlrCom() {
        return vlrCom;
   }

   public void setVlrCom(BigDecimal vlrCom) {
        markAsChanged("VLRCOM", vlrCom);
        this.vlrCom = vlrCom;
   }

   public BigDecimal getVlrComGer() {
        return vlrComGer;
   }

   public void setVlrComGer(BigDecimal vlrComGer) {
        markAsChanged("VLRCOMGER", vlrComGer);
        this.vlrComGer = vlrComGer;
   }

   public BigDecimal getVlrCus() {
        return vlrCus;
   }

   public void setVlrCus(BigDecimal vlrCus) {
        markAsChanged("VLRCUS", vlrCus);
        this.vlrCus = vlrCus;
   }

   public String getCodVolParc() {
        return codVolParc;
   }

   public void setCodVolParc(String codVolParc) {
        markAsChanged("CODVOLPARC", codVolParc);
        this.codVolParc = codVolParc;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
        this.vlrDesc = vlrDesc;
   }

   public BigDecimal getVlrTotLiqMoe() {
        return vlrTotLiqMoe;
   }

   public void setVlrTotLiqMoe(BigDecimal vlrTotLiqMoe) {
        markAsChanged("VLRTOTLIQMOE", vlrTotLiqMoe);
        this.vlrTotLiqMoe = vlrTotLiqMoe;
   }

   public BigDecimal getVlrTotMoe() {
        return vlrTotMoe;
   }

   public void setVlrTotMoe(BigDecimal vlrTotMoe) {
        markAsChanged("VLRTOTMOE", vlrTotMoe);
        this.vlrTotMoe = vlrTotMoe;
   }

   public BigDecimal getVlrDescMoe() {
        return vlrDescMoe;
   }

   public void setVlrDescMoe(BigDecimal vlrDescMoe) {
        markAsChanged("VLRDESCMOE", vlrDescMoe);
        this.vlrDescMoe = vlrDescMoe;
   }

   public BigDecimal getVlrUnitMoe() {
        return vlrUnitMoe;
   }

   public void setVlrUnitMoe(BigDecimal vlrUnitMoe) {
        markAsChanged("VLRUNITMOE", vlrUnitMoe);
        this.vlrUnitMoe = vlrUnitMoe;
   }

   public BigDecimal getCodEspecSt() {
        return codEspecSt;
   }

   public void setCodEspecSt(BigDecimal codEspecSt) {
        markAsChanged("CODESPECST", codEspecSt);
        this.codEspecSt = codEspecSt;
   }

   public BigDecimal getIdAliqIcms() {
        return idAliqIcms;
   }

   public void setIdAliqIcms(BigDecimal idAliqIcms) {
        markAsChanged("IDALIQICMS", idAliqIcms);
        this.idAliqIcms = idAliqIcms;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public BigDecimal getVlrUnitLoc() {
        return vlrUnitLoc;
   }

   public void setVlrUnitLoc(BigDecimal vlrUnitLoc) {
        markAsChanged("VLRUNITLOC", vlrUnitLoc);
        this.vlrUnitLoc = vlrUnitLoc;
   }

   public BigDecimal getCodEnqIpi() {
        return codEnqIpi;
   }

   public void setCodEnqIpi(BigDecimal codEnqIpi) {
        markAsChanged("CODENQIPI", codEnqIpi);
        this.codEnqIpi = codEnqIpi;
   }

   public BigDecimal getVlrUnitLiqMoe() {
        return vlrUnitLiqMoe;
   }

   public void setVlrUnitLiqMoe(BigDecimal vlrUnitLiqMoe) {
        markAsChanged("VLRUNITLIQMOE", vlrUnitLiqMoe);
        this.vlrUnitLiqMoe = vlrUnitLiqMoe;
   }

   public BigDecimal getBaseSubstitAnt() {
        return baseSubstitAnt;
   }

   public void setBaseSubstitAnt(BigDecimal baseSubstitAnt) {
        markAsChanged("BASESUBSTITANT", baseSubstitAnt);
        this.baseSubstitAnt = baseSubstitAnt;
   }

   public BigDecimal getBaseSubstitSemRed() {
        return baseSubstitSemRed;
   }

   public void setBaseSubstitSemRed(BigDecimal baseSubstitSemRed) {
        markAsChanged("BASESUBSTSEMRED", baseSubstitSemRed);
        this.baseSubstitSemRed = baseSubstitSemRed;
   }

   public BigDecimal getCodCav() {
        return codCav;
   }

   public void setCodCav(BigDecimal codCav) {
        markAsChanged("CODCAV", codCav);
        this.codCav = codCav;
   }

   public BigDecimal getCodCfo() {
        return codCfo;
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
        this.codCfo = codCfo;
   }

   public BigDecimal getCodCfps() {
        return codCfps;
   }

   public void setCodCfps(BigDecimal codCfps) {
        markAsChanged("CODCFPS", codCfps);
        this.codCfps = codCfps;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
        this.codExec = codExec;
   }

   public BigDecimal getCodLocalDest() {
        return codLocalDest;
   }

   public void setCodLocalDest(BigDecimal codLocalDest) {
        markAsChanged("CODLOCALDEST", codLocalDest);
        this.codLocalDest = codLocalDest;
   }

   public BigDecimal getCodLocalOrig() {
        return codLocalOrig;
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
        this.codLocalOrig = codLocalOrig;
   }

   public BigDecimal getCodMotDesoneraIcms() {
        return codMotDesoneraIcms;
   }

   public void setCodMotDesoneraIcms(BigDecimal codMotDesoneraIcms) {
        markAsChanged("CODMOTDESONERAICMS", codMotDesoneraIcms);
        this.codMotDesoneraIcms = codMotDesoneraIcms;
   }

   public BigDecimal getCodObsPadrao() {
        return codObsPadrao;
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        markAsChanged("CODOBSPADRAO", codObsPadrao);
        this.codObsPadrao = codObsPadrao;
   }

   public BigDecimal getCodParceExec() {
        return codParceExec;
   }

   public void setCodParceExec(BigDecimal codParceExec) {
        markAsChanged("CODPARCEXEC", codParceExec);
        this.codParceExec = codParceExec;
   }

   public BigDecimal getCodProc() {
        return codProc;
   }

   public void setCodProc(BigDecimal codProc) {
        markAsChanged("CODPROC", codProc);
        this.codProc = codProc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodPromo() {
        return codPromo;
   }

   public void setCodPromo(BigDecimal codPromo) {
        markAsChanged("CODPROMO", codPromo);
        this.codPromo = codPromo;
   }

   public BigDecimal getCodTpa() {
        return codTpa;
   }

   public void setCodTpa(BigDecimal codTpa) {
        markAsChanged("CODTPA", codTpa);
        this.codTpa = codTpa;
   }

   public BigDecimal getCodTrib() {
        return codTrib;
   }

   public void setCodTrib(BigDecimal codTrib) {
        markAsChanged("CODTRIB", codTrib);
        this.codTrib = codTrib;
   }

   public BigDecimal getCodTribIss() {
        return codTribIss;
   }

   public void setCodTribIss(BigDecimal codTribIss) {
        markAsChanged("CODTRIBISS", codTribIss);
        this.codTribIss = codTribIss;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getCodVolPad() {
        return codVolPad;
   }

   public void setCodVolPad(String codVolPad) {
        markAsChanged("CODVOLPAD", codVolPad);
        this.codVolPad = codVolPad;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
        this.complDesc = complDesc;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getControleDest() {
        return controleDest;
   }

   public void setControleDest(String controleDest) {
        markAsChanged("CONTROLEDEST", controleDest);
        this.controleDest = controleDest;
   }

   public BigDecimal getCsosn() {
        return csosn;
   }

   public void setCsosn(BigDecimal csosn) {
        markAsChanged("CSOSN", csosn);
        this.csosn = csosn;
   }

   public BigDecimal getCstIpi() {
        return cstIpi;
   }

   public void setCstIpi(BigDecimal cstIpi) {
        markAsChanged("CSTIPI", cstIpi);
        this.cstIpi = cstIpi;
   }

   public BigDecimal getCusto() {
        return custo;
   }

   public void setCusto(BigDecimal custo) {
        markAsChanged("CUSTO", custo);
        this.custo = custo;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtVigor() {
        return dtVigor;
   }

   public void setDtVigor(Timestamp dtVigor) {
        markAsChanged("DTVIGOR", dtVigor);
        this.dtVigor = dtVigor;
   }

   public String getEndImagem() {
        return endImagem;
   }

   public void setEndImagem(String endImagem) {
        markAsChanged("ENDIMAGEM", endImagem);
        this.endImagem = endImagem;
   }

   public BigDecimal getEspessura() {
        return espessura;
   }

   public void setEspessura(BigDecimal espessura) {
        markAsChanged("ESPESSURA", espessura);
        this.espessura = espessura;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
        this.estoque = estoque;
   }

   public String getFaturar() {
        return faturar;
   }

   public void setFaturar(String faturar) {
        markAsChanged("FATURAR", faturar);
        this.faturar = faturar;
   }

   public BigDecimal getGrupoTransg() {
        return grupoTransg;
   }

   public void setGrupoTransg(BigDecimal grupoTransg) {
        markAsChanged("GRUPOTRANSG", grupoTransg);
        this.grupoTransg = grupoTransg;
   }

   public String getGtinNfe() {
        return gtinNfe;
   }

   public void setGtinNfe(String gtinNfe) {
        markAsChanged("GTINNFE", gtinNfe);
        this.gtinNfe = gtinNfe;
   }

   public String getGtinTribNfe() {
        return gtinTribNfe;
   }

   public void setGtinTribNfe(String gtinTribNfe) {
        markAsChanged("GTINTRIBNFE", gtinTribNfe);
        this.gtinTribNfe = gtinTribNfe;
   }

   public BigDecimal getLargura() {
        return largura;
   }

   public void setLargura(BigDecimal largura) {
        markAsChanged("LARGURA", largura);
        this.largura = largura;
   }

   public BigDecimal getM3() {
        return m3;
   }

   public void setM3(BigDecimal m3) {
        markAsChanged("M3", m3);
        this.m3 = m3;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
        this.marca = marca;
   }

   public String getNcm() {
        return ncm;
   }

   public void setNcm(String ncm) {
        markAsChanged("NCM", ncm);
        this.ncm = ncm;
   }

   public String getNrSerieReserva() {
        return nrSerieReserva;
   }

   public void setNrSerieReserva(String nrSerieReserva) {
        markAsChanged("NRSERIERESERVA", nrSerieReserva);
        this.nrSerieReserva = nrSerieReserva;
   }

   public String getNumPedido2() {
        return numPedido2;
   }

   public void setNumPedido2(String numPedido2) {
        markAsChanged("NUMPEDIDO2", numPedido2);
        this.numPedido2 = numPedido2;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuPromocao() {
        return nuPromocao;
   }

   public void setNuPromocao(BigDecimal nuPromocao) {
        markAsChanged("NUPROMOCAO", nuPromocao);
        this.nuPromocao = nuPromocao;
   }

   public BigDecimal getNuTab() {
        return nuTab;
   }

   public void setNuTab(BigDecimal nuTab) {
        markAsChanged("NUTAB", nuTab);
        this.nuTab = nuTab;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getOrigProd() {
        return origProd;
   }

   public void setOrigProd(String origProd) {
        markAsChanged("ORIGPROD", origProd);
        this.origProd = origProd;
   }

   public String getPendente() {
        return pendente;
   }

   public void setPendente(String pendente) {
        markAsChanged("PENDENTE", pendente);
        this.pendente = pendente;
   }

   public BigDecimal getPercCom() {
        return percCom;
   }

   public void setPercCom(BigDecimal percCom) {
        markAsChanged("PERCCOM", percCom);
        this.percCom = percCom;
   }

   public BigDecimal getPercComGer() {
        return percComGer;
   }

   public void setPercComGer(BigDecimal percComGer) {
        markAsChanged("PERCCOMGER", percComGer);
        this.percComGer = percComGer;
   }

   public BigDecimal getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
        this.percDesc = percDesc;
   }

   public BigDecimal getPercDescBase() {
        return percDescBase;
   }

   public void setPercDescBase(BigDecimal percDescBase) {
        markAsChanged("PERCDESCBASE", percDescBase);
        this.percDescBase = percDescBase;
   }

   public BigDecimal getPercDescBonif() {
        return percDescBonif;
   }

   public void setPercDescBonif(BigDecimal percDescBonif) {
        markAsChanged("PERCDESCBONIF", percDescBonif);
        this.percDescBonif = percDescBonif;
   }

   public BigDecimal getPercDescDigitado() {
        return percDescDigitado;
   }

   public void setPercDescDigitado(BigDecimal percDescDigitado) {
        markAsChanged("PERCDESCDIGITADO", percDescDigitado);
        this.percDescDigitado = percDescDigitado;
   }

   public BigDecimal getPercDescProm() {
        return percDescProm;
   }

   public void setPercDescProm(BigDecimal percDescProm) {
        markAsChanged("PERCDESCPROM", percDescProm);
        this.percDescProm = percDescProm;
   }

   public BigDecimal getPercDescTgfdes() {
        return percDescTgfdes;
   }

   public void setPercDescTgfdes(BigDecimal percDescTgfdes) {
        markAsChanged("PERCDESCTGFDES", percDescTgfdes);
        this.percDescTgfdes = percDescTgfdes;
   }

   public BigDecimal getPercGermin() {
        return percGermin;
   }

   public void setPercGermin(BigDecimal percGermin) {
        markAsChanged("PERCGERMIN", percGermin);
        this.percGermin = percGermin;
   }

   public BigDecimal getPercPureza() {
        return percPureza;
   }

   public void setPercPureza(BigDecimal percPureza) {
        markAsChanged("PERCPUREZA", percPureza);
        this.percPureza = percPureza;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getPesoLiq() {
        return pesoLiq;
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        markAsChanged("PESOLIQ", pesoLiq);
        this.pesoLiq = pesoLiq;
   }

   public BigDecimal getPrecoBase() {
        return precoBase;
   }

   public void setPrecoBase(BigDecimal precoBase) {
        markAsChanged("PRECOBASE", precoBase);
        this.precoBase = precoBase;
   }

   public BigDecimal getPrecoBaseQtd() {
        return precoBaseQtd;
   }

   public void setPrecoBaseQtd(BigDecimal precoBaseQtd) {
        markAsChanged("PRECOBASEQTD", precoBaseQtd);
        this.precoBaseQtd = precoBaseQtd;
   }

   public String getProdutoNfe() {
        return produtoNfe;
   }

   public void setProdutoNfe(String produtoNfe) {
        markAsChanged("PRODUTONFE", produtoNfe);
        this.produtoNfe = produtoNfe;
   }

   public BigDecimal getQtdConferida() {
        return qtdConferida;
   }

   public void setQtdConferida(BigDecimal qtdConferida) {
        markAsChanged("QTDCONFERIDA", qtdConferida);
        this.qtdConferida = qtdConferida;
   }

   public BigDecimal getQtdEntregue() {
        return qtdEntregue;
   }

   public void setQtdEntregue(BigDecimal qtdEntregue) {
        markAsChanged("QTDENTREGUE", qtdEntregue);
        this.qtdEntregue = qtdEntregue;
   }

   public BigDecimal getQtdFat() {
        return qtdFat;
   }

   public void setQtdFat(BigDecimal qtdFat) {
        markAsChanged("QTDFAT", qtdFat);
        this.qtdFat = qtdFat;
   }

   public BigDecimal getQtdFixada() {
        return qtdFixada;
   }

   public void setQtdFixada(BigDecimal qtdFixada) {
        markAsChanged("QTDFIXADA", qtdFixada);
        this.qtdFixada = qtdFixada;
   }

   public BigDecimal getQtdFormula() {
        return qtdFormula;
   }

   public void setQtdFormula(BigDecimal qtdFormula) {
        markAsChanged("QTDFORMULA", qtdFormula);
        this.qtdFormula = qtdFormula;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
        this.qtdNeg = qtdNeg;
   }

   public BigDecimal getQtdPeca() {
        return qtdPeca;
   }

   public void setQtdPeca(BigDecimal qtdPeca) {
        markAsChanged("QTDPECA", qtdPeca);
        this.qtdPeca = qtdPeca;
   }

   public BigDecimal getQtdPendente() {
        return qtdPendente;
   }

   public void setQtdPendente(BigDecimal qtdPendente) {
        markAsChanged("QTDPENDENTE", qtdPendente);
        this.qtdPendente = qtdPendente;
   }

   public BigDecimal getQtdUnidPad() {
        return qtdUnidPad;
   }

   public void setQtdUnidPad(BigDecimal qtdUnidPad) {
        markAsChanged("QTDUNIDPAD", qtdUnidPad);
        this.qtdUnidPad = qtdUnidPad;
   }

   public BigDecimal getQtdWms() {
        return qtdWms;
   }

   public void setQtdWms(BigDecimal qtdWms) {
        markAsChanged("QTDWMS", qtdWms);
        this.qtdWms = qtdWms;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getRefForn() {
        return refForn;
   }

   public void setRefForn(String refForn) {
        markAsChanged("REFFORN", refForn);
        this.refForn = refForn;
   }

   public String getReserva() {
        return reserva;
   }

   public void setReserva(String reserva) {
        markAsChanged("RESERVA", reserva);
        this.reserva = reserva;
   }

   public String getSeqPedido2() {
        return seqPedido2;
   }

   public void setSeqPedido2(String seqPedido2) {
        markAsChanged("SEQPEDIDO2", seqPedido2);
        this.seqPedido2 = seqPedido2;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSolCompra() {
        return solCompra;
   }

   public void setSolCompra(String solCompra) {
        markAsChanged("SOLCOMPRA", solCompra);
        this.solCompra = solCompra;
   }

   public String getStatusLote() {
        return statusLote;
   }

   public void setStatusLote(String statusLote) {
        markAsChanged("STATUSLOTE", statusLote);
        this.statusLote = statusLote;
   }

   public String getStatusNota() {
        return statusNota;
   }

   public void setStatusNota(String statusNota) {
        markAsChanged("STATUSNOTA", statusNota);
        this.statusNota = statusNota;
   }

   public String getAltPreco() {
        return altPreco;
   }

   public void setAltPreco(String altPreco) {
        markAsChanged("ALTPRECO", altPreco);
        this.altPreco = altPreco;
   }

   public BigDecimal getAltura() {
        return altura;
   }

   public void setAltura(BigDecimal altura) {
        markAsChanged("ALTURA", altura);
        this.altura = altura;
   }

   public BigDecimal getQtdVol() {
        return qtdVol;
   }

   public void setQtdVol(BigDecimal qtdVol) {
        markAsChanged("QTDVOL", qtdVol);
        this.qtdVol = qtdVol;
   }

   public Timestamp getDtInicio() {
        return dtInicio;
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
        this.dtInicio = dtInicio;
   }

   public BigDecimal getAliqStExtraNota() {
        return aliqStExtraNota;
   }

   public void setAliqStExtraNota(BigDecimal aliqStExtraNota) {
        markAsChanged("ALIQSTEXTRANOTA", aliqStExtraNota);
        this.aliqStExtraNota = aliqStExtraNota;
   }

   public BigDecimal getAliqStFcpStAnt() {
        return aliqStFcpStAnt;
   }

   public void setAliqStFcpStAnt(BigDecimal aliqStFcpStAnt) {
        markAsChanged("ALIQSTFCPSTANT", aliqStFcpStAnt);
        this.aliqStFcpStAnt = aliqStFcpStAnt;
   }

   public BigDecimal getBaseStExtraNota() {
        return baseStExtraNota;
   }

   public void setBaseStExtraNota(BigDecimal baseStExtraNota) {
        markAsChanged("BASESTEXTRANOTA", baseStExtraNota);
        this.baseStExtraNota = baseStExtraNota;
   }

   public String getOrigemBusca() {
        return origemBusca;
   }

   public void setOrigemBusca(String origemBusca) {
        markAsChanged("ORIGEMBUSCA", origemBusca);
        this.origemBusca = origemBusca;
   }

   public BigDecimal getProdutoPesquisado() {
        return produtoPesquisado;
   }

   public void setProdutoPesquisado(BigDecimal produtoPesquisado) {
        markAsChanged("PRODUTOPESQUISADO", produtoPesquisado);
        this.produtoPesquisado = produtoPesquisado;
   }

   public BigDecimal getQtdTribExport() {
        return qtdTribExport;
   }

   public void setQtdTribExport(BigDecimal qtdTribExport) {
        markAsChanged("QTDTRIBEXPORT", qtdTribExport);
        this.qtdTribExport = qtdTribExport;
   }

   public BigDecimal getReservado() {
        return reservado;
   }

   public void setReservado(BigDecimal reservado) {
        markAsChanged("RESERVADO", reservado);
        this.reservado = reservado;
   }

   public BigDecimal getVlrRepRedSemDesc() {
        return vlrRepRedSemDesc;
   }

   public void setVlrRepRedSemDesc(BigDecimal vlrRepRedSemDesc) {
        markAsChanged("VLRREPREDSEMDESC", vlrRepRedSemDesc);
        this.vlrRepRedSemDesc = vlrRepRedSemDesc;
   }

   public BigDecimal getVlrTotLiqRef() {
        return vlrTotLiqRef;
   }

   public void setVlrTotLiqRef(BigDecimal vlrTotLiqRef) {
        markAsChanged("VLRTOTLIQREF", vlrTotLiqRef);
        this.vlrTotLiqRef = vlrTotLiqRef;
   }

   public BigDecimal getVlrVendaPromo() {
        return vlrVendaPromo;
   }

   public void setVlrVendaPromo(BigDecimal vlrVendaPromo) {
        markAsChanged("VLRVENDAPROMO", vlrVendaPromo);
        this.vlrVendaPromo = vlrVendaPromo;
   }

   public BigDecimal getNuFop() {
        return nuFop;
   }

   public void setNuFop(BigDecimal nuFop) {
        markAsChanged("NUFOP", nuFop);
        this.nuFop = nuFop;
   }

   public BigDecimal getSequenciaFiscal() {
        return sequenciaFiscal;
   }

   public void setSequenciaFiscal(BigDecimal sequenciaFiscal) {
        markAsChanged("SEQUENCIAFISCAL", sequenciaFiscal);
        this.sequenciaFiscal = sequenciaFiscal;
   }

   public BigDecimal getCodLocalTerc() {
        return codLocalTerc;
   }

   public void setCodLocalTerc(BigDecimal codLocalTerc) {
        markAsChanged("CODLOCALTERC", codLocalTerc);
        this.codLocalTerc = codLocalTerc;
   }

   public BigDecimal getPercStFcpIntAnt() {
        return percStFcpIntAnt;
   }

   public void setPercStFcpIntAnt(BigDecimal percStFcpIntAnt) {
        markAsChanged("PERCSTFCPINTANT", percStFcpIntAnt);
        this.percStFcpIntAnt = percStFcpIntAnt;
   }

   public BigDecimal getVlrStFcpIntAnt() {
        return vlrStFcpIntAnt;
   }

   public void setVlrStFcpIntAnt(BigDecimal vlrStFcpIntAnt) {
        markAsChanged("VLRSTFCPINTANT", vlrStFcpIntAnt);
        this.vlrStFcpIntAnt = vlrStFcpIntAnt;
   }

   public BigDecimal getBaseStFcpIntAnt() {
        return baseStFcpIntAnt;
   }

   public void setBaseStFcpIntAnt(BigDecimal baseStFcpIntAnt) {
        markAsChanged("BASESTFCPINTANT", baseStFcpIntAnt);
        this.baseStFcpIntAnt = baseStFcpIntAnt;
   }

   public String getIndEscala() {
        return indEscala;
   }

   public void setIndEscala(String indEscala) {
        markAsChanged("INDESCALA", indEscala);
        this.indEscala = indEscala;
   }

   public String getCodBenefNauf() {
        return codBenefNauf;
   }

   public void setCodBenefNauf(String codBenefNauf) {
        markAsChanged("CODBENEFNAUF", codBenefNauf);
        this.codBenefNauf = codBenefNauf;
   }

   public String getCnpjFabricante() {
        return cnpjFabricante;
   }

   public void setCnpjFabricante(String cnpjFabricante) {
        markAsChanged("CNPJFABRICANTE", cnpjFabricante);
        this.cnpjFabricante = cnpjFabricante;
   }

   public String getCodAgregacao() {
        return codAgregacao;
   }

   public void setCodAgregacao(String codAgregacao) {
        markAsChanged("CODAGREGACAO", codAgregacao);
        this.codAgregacao = codAgregacao;
   }

   public BigDecimal getPercRedVlrIpi() {
        return percRedVlrIpi;
   }

   public void setPercRedVlrIpi(BigDecimal percRedVlrIpi) {
        markAsChanged("PERCREDVLRIPI", percRedVlrIpi);
        this.percRedVlrIpi = percRedVlrIpi;
   }

   public BigDecimal getCodDocArrecad() {
        return codDocArrecad;
   }

   public void setCodDocArrecad(BigDecimal codDocArrecad) {
        markAsChanged("CODDOCARRECAD", codDocArrecad);
        this.codDocArrecad = codDocArrecad;
   }

   public String getNumDocArrecad() {
        return numDocArrecad;
   }

   public void setNumDocArrecad(String numDocArrecad) {
        markAsChanged("NUMDOCARRECAD", numDocArrecad);
        this.numDocArrecad = numDocArrecad;
   }

   public BigDecimal getBaseCalcStExtraNota() {
        return baseCalcStExtraNota;
   }

   public void setBaseCalcStExtraNota(BigDecimal baseCalcStExtraNota) {
        markAsChanged("BASECALCSTEXTRANOTA", baseCalcStExtraNota);
        this.baseCalcStExtraNota = baseCalcStExtraNota;
   }

   public BigDecimal getMargLucro() {
        return margLucro;
   }

   public void setMargLucro(BigDecimal margLucro) {
        markAsChanged("MARGLUCRO", margLucro);
        this.margLucro = margLucro;
   }

   public BigDecimal getRedBaseSt() {
        return redBaseSt;
   }

   public void setRedBaseSt(BigDecimal redBaseSt) {
        markAsChanged("REDBASEST", redBaseSt);
        this.redBaseSt = redBaseSt;
   }

   public BigDecimal getVlrIcmsDiferido() {
        return vlrIcmsDiferido;
   }

   public void setVlrIcmsDiferido(BigDecimal vlrIcmsDiferido) {
        markAsChanged("VLRICMSDIFERIDO", vlrIcmsDiferido);
        this.vlrIcmsDiferido = vlrIcmsDiferido;
   }

   public String getTipoSeparacao() {
        return tipoSeparacao;
   }

   public void setTipoSeparacao(String tipoSeparacao) {
        markAsChanged("TIPOSEPARACAO", tipoSeparacao);
        this.tipoSeparacao = tipoSeparacao;
   }

   public String getNroProcesso() {
        return nroProcesso;
   }

   public void setNroProcesso(String nroProcesso) {
        markAsChanged("NROPROCESSO", nroProcesso);
        this.nroProcesso = nroProcesso;
   }

   public BigDecimal getBaseSubstitUnitOrig() {
        return baseSubstitUnitOrig;
   }

   public void setBaseSubstitUnitOrig(BigDecimal baseSubstitUnitOrig) {
        markAsChanged("BASESUBSTITUNITORIG", baseSubstitUnitOrig);
        this.baseSubstitUnitOrig = baseSubstitUnitOrig;
   }

   public BigDecimal getVlrSubstitUnitOrig() {
        return vlrSubstitUnitOrig;
   }

   public void setVlrSubstitUnitOrig(BigDecimal vlrSubstitUnitOrig) {
        markAsChanged("VLRSUBSTUNITORIG", vlrSubstitUnitOrig);
        this.vlrSubstitUnitOrig = vlrSubstitUnitOrig;
   }

   public BigDecimal getPercDescFornecedor() {
        return percDescFornecedor;
   }

   public void setPercDescFornecedor(BigDecimal percDescFornecedor) {
        markAsChanged("PERCDESCFORNECEDOR", percDescFornecedor);
        this.percDescFornecedor = percDescFornecedor;
   }

   public String getStatusProc() {
        return statusProc;
   }

   public void setStatusProc(String statusProc) {
        markAsChanged("STATUSPROC", statusProc);
        this.statusProc = statusProc;
   }

   public String getOperAtual() {
        return operAtual;
   }

   public void setOperAtual(String operAtual) {
        markAsChanged("OPERATUAL", operAtual);
        this.operAtual = operAtual;
   }

   public String getGeraProducao() {
        return geraProducao;
   }

   public void setGeraProducao(String geraProducao) {
        markAsChanged("GERAPRODUCAO", geraProducao);
        this.geraProducao = geraProducao;
   }

   public BigDecimal getIcmsStFrete() {
        return icmsStFrete;
   }

   public void setIcmsStFrete(BigDecimal icmsStFrete) {
        markAsChanged("ICMSSTFRETE", icmsStFrete);
        this.icmsStFrete = icmsStFrete;
   }

   public BigDecimal getIdAliqIcmsDifIcms() {
        return idAliqIcmsDifIcms;
   }

   public void setIdAliqIcmsDifIcms(BigDecimal idAliqIcmsDifIcms) {
        markAsChanged("IDALIQICMSDIFICMS", idAliqIcmsDifIcms);
        this.idAliqIcmsDifIcms = idAliqIcmsDifIcms;
   }

   public String getCodBarraPdv() {
        return codBarraPdv;
   }

   public void setCodBarraPdv(String codBarraPdv) {
        markAsChanged("CODBARRAPDV", codBarraPdv);
        this.codBarraPdv = codBarraPdv;
   }

   public BigDecimal getAliqFetHab() {
        return aliqFetHab;
   }

   public void setAliqFetHab(BigDecimal aliqFetHab) {
        markAsChanged("ALIQFETHAB", aliqFetHab);
        this.aliqFetHab = aliqFetHab;
   }

   public BigDecimal getVlrFetHab() {
        return vlrFetHab;
   }

   public void setVlrFetHab(BigDecimal vlrFetHab) {
        markAsChanged("VLRFETHAB", vlrFetHab);
        this.vlrFetHab = vlrFetHab;
   }

   public String getCodSit08Efd() {
        return codSit08Efd;
   }

   public void setCodSit08Efd(String codSit08Efd) {
        markAsChanged("CODSIT08EFD", codSit08Efd);
        this.codSit08Efd = codSit08Efd;
   }

   public BigDecimal getAliqFuntTel() {
        return aliqFuntTel;
   }

   public void setAliqFuntTel(BigDecimal aliqFuntTel) {
        markAsChanged("ALIQFUNTTEL", aliqFuntTel);
        this.aliqFuntTel = aliqFuntTel;
   }

   public BigDecimal getAliqFust() {
        return aliqFust;
   }

   public void setAliqFust(BigDecimal aliqFust) {
        markAsChanged("ALIQFUST", aliqFust);
        this.aliqFust = aliqFust;
   }

   public BigDecimal getBaseFuntTel() {
        return baseFuntTel;
   }

   public void setBaseFuntTel(BigDecimal baseFuntTel) {
        markAsChanged("BASEFUNTTEL", baseFuntTel);
        this.baseFuntTel = baseFuntTel;
   }

   public BigDecimal getBaseFust() {
        return baseFust;
   }

   public void setBaseFust(BigDecimal baseFust) {
        markAsChanged("BASEFUST", baseFust);
        this.baseFust = baseFust;
   }

   public BigDecimal getVlrFuntTel() {
        return vlrFuntTel;
   }

   public void setVlrFuntTel(BigDecimal vlrFuntTel) {
        markAsChanged("VLRFUNTTEL", vlrFuntTel);
        this.vlrFuntTel = vlrFuntTel;
   }

   public BigDecimal getVlrFust() {
        return vlrFust;
   }

   public void setVlrFust(BigDecimal vlrFust) {
        markAsChanged("VLRFUST", vlrFust);
        this.vlrFust = vlrFust;
   }

   public BigDecimal getTipUtilCom() {
        return tipUtilCom;
   }

   public void setTipUtilCom(BigDecimal tipUtilCom) {
        markAsChanged("TIPUTILCOM", tipUtilCom);
        this.tipUtilCom = tipUtilCom;
   }

   public BigDecimal getPercUsaquDecpe() {
        return percUsaquDecpe;
   }

   public void setPercUsaquDecpe(BigDecimal percUsaquDecpe) {
        markAsChanged("PERCUSAQUDECPE", percUsaquDecpe);
        this.percUsaquDecpe = percUsaquDecpe;
   }

   public BigDecimal getVlrCusAquDecpe() {
        return vlrCusAquDecpe;
   }

   public void setVlrCusAquDecpe(BigDecimal vlrCusAquDecpe) {
        markAsChanged("VLRCUSAQUDECPE", vlrCusAquDecpe);
        this.vlrCusAquDecpe = vlrCusAquDecpe;
   }

   public BigDecimal getBaseIcmsStFrete() {
        return baseIcmsStFrete;
   }

   public void setBaseIcmsStFrete(BigDecimal baseIcmsStFrete) {
        markAsChanged("BASEICMSSTFRETE", baseIcmsStFrete);
        this.baseIcmsStFrete = baseIcmsStFrete;
   }

   public BigDecimal getCodMotDesoneraSt() {
        return codMotDesoneraSt;
   }

   public void setCodMotDesoneraSt(BigDecimal codMotDesoneraSt) {
        markAsChanged("CODMOTDESONERAST", codMotDesoneraSt);
        this.codMotDesoneraSt = codMotDesoneraSt;
   }

   public BigDecimal getVlrRepRedSt() {
        return vlrRepRedSt;
   }

   public void setVlrRepRedSt(BigDecimal vlrRepRedSt) {
        markAsChanged("VLRREPREDST", vlrRepRedSt);
        this.vlrRepRedSt = vlrRepRedSt;
   }

   public String getUnidade() {
        return unidade;
   }

   public void setUnidade(String unidade) {
        markAsChanged("UNIDADE", unidade);
        this.unidade = unidade;
   }

   public String getTipEntrega() {
        return tipEntrega;
   }

   public void setTipEntrega(String tipEntrega) {
        markAsChanged("TIPENTREGA", tipEntrega);
        this.tipEntrega = tipEntrega;
   }

   public BigDecimal getAliqIcmsAt() {
        return aliqIcmsAt;
   }

   public void setAliqIcmsAt(BigDecimal aliqIcmsAt) {
        markAsChanged("ALIQICMSAT", aliqIcmsAt);
        this.aliqIcmsAt = aliqIcmsAt;
   }

   public BigDecimal getAliqInterIcmsAt() {
        return aliqInterIcmsAt;
   }

   public void setAliqInterIcmsAt(BigDecimal aliqInterIcmsAt) {
        markAsChanged("ALIQINTERICMSAT", aliqInterIcmsAt);
        this.aliqInterIcmsAt = aliqInterIcmsAt;
   }

   public BigDecimal getBaseIcmsAt() {
        return baseIcmsAt;
   }

   public void setBaseIcmsAt(BigDecimal baseIcmsAt) {
        markAsChanged("BASEICMSAT", baseIcmsAt);
        this.baseIcmsAt = baseIcmsAt;
   }

   public BigDecimal getIdAliqIcmsAt() {
        return idAliqIcmsAt;
   }

   public void setIdAliqIcmsAt(BigDecimal idAliqIcmsAt) {
        markAsChanged("IDALIQICMSAT", idAliqIcmsAt);
        this.idAliqIcmsAt = idAliqIcmsAt;
   }

   public BigDecimal getVlrIcmsAt() {
        return vlrIcmsAt;
   }

   public void setVlrIcmsAt(BigDecimal vlrIcmsAt) {
        markAsChanged("VLRICMSAT", vlrIcmsAt);
        this.vlrIcmsAt = vlrIcmsAt;
   }

   public BigDecimal getIdDescParceria() {
        return idDescParceria;
   }

   public void setIdDescParceria(BigDecimal idDescParceria) {
        markAsChanged("IDDESCPARCERIA", idDescParceria);
        this.idDescParceria = idDescParceria;
   }

   public BigDecimal getVlrDescParceria() {
        return vlrDescParceria;
   }

   public void setVlrDescParceria(BigDecimal vlrDescParceria) {
        markAsChanged("VLRDESCPARCERIA", vlrDescParceria);
        this.vlrDescParceria = vlrDescParceria;
   }

   public String getCodFci() {
        return codFci;
   }

   public void setCodFci(String codFci) {
        markAsChanged("CODFCI", codFci);
        this.codFci = codFci;
   }

   public BigDecimal getPercUsaquDecpeEst() {
        return percUsaquDecpeEst;
   }

   public void setPercUsaquDecpeEst(BigDecimal percUsaquDecpeEst) {
        markAsChanged("PERCUSAQUDECPEEST", percUsaquDecpeEst);
        this.percUsaquDecpeEst = percUsaquDecpeEst;
   }

   public BigDecimal getCodIpi() {
        return codIpi;
   }

   public void setCodIpi(BigDecimal codIpi) {
        markAsChanged("CODIPI", codIpi);
        this.codIpi = codIpi;
   }

   public BigDecimal getIdAliqIss() {
        return idAliqIss;
   }

   public void setIdAliqIss(BigDecimal idAliqIss) {
        markAsChanged("IDALIQISS", idAliqIss);
        this.idAliqIss = idAliqIss;
   }

   public BigDecimal getCodNatRend() {
        return codNatRend;
   }

   public void setCodNatRend(BigDecimal codNatRend) {
        markAsChanged("CODNATREND", codNatRend);
        this.codNatRend = codNatRend;
   }

   public String getIndRepDes() {
        return indRepDes;
   }

   public void setIndRepDes(String indRepDes) {
        markAsChanged("INDREPDES", indRepDes);
        this.indRepDes = indRepDes;
   }

   @Override
   public String getTableName() {
        return "TGFITE";
   }

   @Override
   public String getEntityName() {
        return "ItemNota";
   }

   @Override
   public ItemNota fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.aliqIcmsRed = vo.asBigDecimal("ALIQICMSRED");
        this.aliqIpi = vo.asBigDecimal("ALIQIPI");
        this.aliqIss = vo.asBigDecimal("ALIQISS");
        this.vlrIcmsUfDest = vo.asBigDecimal("VLRICMSUFDEST");
        this.vlrIpi = vo.asBigDecimal("VLRIPI");
        this.vlrIss = vo.asBigDecimal("VLRISS");
        this.vlrLiqProm = vo.asBigDecimal("VLRLIQPROM");
        this.vlrPromo = vo.asBigDecimal("VLRPROMO");
        this.vlrPtoPureza = vo.asBigDecimal("VLRPTOPUREZA");
        this.vlrRepRed = vo.asBigDecimal("VLRREPRED");
        this.vlrRetencao = vo.asBigDecimal("VLRRETENCAO");
        this.vlrStExtraNota = vo.asBigDecimal("VLRSTEXTRANOTA");
        this.vlrSubst = vo.asBigDecimal("VLRSUBST");
        this.vlrSubstAnt = vo.asBigDecimal("VLRSUBSTANT");
        this.vlrSugerido = vo.asBigDecimal("VLRSUGERIDO");
        this.vlrTot = vo.asBigDecimal("VLRTOT");
        this.vlrTotLiq = vo.asBigDecimal("VLRTOTLIQ");
        this.vlrTroca = vo.asBigDecimal("VLRTROCA");
        this.vlrUnidPad = vo.asBigDecimal("VLRUNIDPAD");
        this.vlrUnit = vo.asBigDecimal("VLRUNIT");
        this.vlrUnitDolar = vo.asBigDecimal("VLRUNITDOLAR");
        this.vlrUnitLiq = vo.asBigDecimal("VLRUNITLIQ");
        this.vlrDescBonif = vo.asBigDecimal("VLRDESCBONIF");
        this.basicmMod = vo.asBigDecimal("BASICMMOD");
        this.basicmStMod = vo.asBigDecimal("BASICMSTMOD");
        this.codAntecipSt = vo.asString("CODANTECIPST");
        this.numeroOs = vo.asBigDecimal("NUMEROOS");
        this.atualEstoque = vo.asBigDecimal("ATUALESTOQUE");
        this.atualEstTerc = vo.asString("ATUALESTTERC");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.baseIpi = vo.asBigDecimal("BASEIPI");
        this.baseIss = vo.asBigDecimal("BASEISS");
        this.baseStAnt = vo.asBigDecimal("BASESTANT");
        this.baseStUfDest = vo.asBigDecimal("BASESTUFDEST");
        this.baseSubstit = vo.asBigDecimal("BASESUBSTIT");
        this.vlrDescDigitado = vo.asBigDecimal("VLRDESCDIGITADO");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrIcmsAnt = vo.asBigDecimal("VLRICMSANT");
        this.terceiros = vo.asString("TERCEIROS");
        this.usoProd = vo.asString("USOPROD");
        this.variacaoFcp = vo.asBigDecimal("VARIACAOFCP");
        this.vlrAcrescDesc = vo.asBigDecimal("VLRACRESCDESC");
        this.vlrCom = vo.asBigDecimal("VLRCOM");
        this.vlrComGer = vo.asBigDecimal("VLRCOMGER");
        this.vlrCus = vo.asBigDecimal("VLRCUS");
        this.codVolParc = vo.asString("CODVOLPARC");
        this.vlrDesc = vo.asBigDecimal("VLRDESC");
        this.vlrTotLiqMoe = vo.asBigDecimal("VLRTOTLIQMOE");
        this.vlrTotMoe = vo.asBigDecimal("VLRTOTMOE");
        this.vlrDescMoe = vo.asBigDecimal("VLRDESCMOE");
        this.vlrUnitMoe = vo.asBigDecimal("VLRUNITMOE");
        this.codEspecSt = vo.asBigDecimal("CODESPECST");
        this.idAliqIcms = vo.asBigDecimal("IDALIQICMS");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.vlrUnitLoc = vo.asBigDecimal("VLRUNITLOC");
        this.codEnqIpi = vo.asBigDecimal("CODENQIPI");
        this.vlrUnitLiqMoe = vo.asBigDecimal("VLRUNITLIQMOE");
        this.baseSubstitAnt = vo.asBigDecimal("BASESUBSTITANT");
        this.baseSubstitSemRed = vo.asBigDecimal("BASESUBSTSEMRED");
        this.codCav = vo.asBigDecimal("CODCAV");
        this.codCfo = vo.asBigDecimal("CODCFO");
        this.codCfps = vo.asBigDecimal("CODCFPS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.codLocalDest = vo.asBigDecimal("CODLOCALDEST");
        this.codLocalOrig = vo.asBigDecimal("CODLOCALORIG");
        this.codMotDesoneraIcms = vo.asBigDecimal("CODMOTDESONERAICMS");
        this.codObsPadrao = vo.asBigDecimal("CODOBSPADRAO");
        this.codParceExec = vo.asBigDecimal("CODPARCEXEC");
        this.codProc = vo.asBigDecimal("CODPROC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codPromo = vo.asBigDecimal("CODPROMO");
        this.codTpa = vo.asBigDecimal("CODTPA");
        this.codTrib = vo.asBigDecimal("CODTRIB");
        this.codTribIss = vo.asBigDecimal("CODTRIBISS");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.codVol = vo.asString("CODVOL");
        this.codVolPad = vo.asString("CODVOLPAD");
        this.complDesc = vo.asString("COMPLDESC");
        this.controle = vo.asString("CONTROLE");
        this.controleDest = vo.asString("CONTROLEDEST");
        this.csosn = vo.asBigDecimal("CSOSN");
        this.cstIpi = vo.asBigDecimal("CSTIPI");
        this.custo = vo.asBigDecimal("CUSTO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtVigor = vo.asTimestamp("DTVIGOR");
        this.endImagem = vo.asString("ENDIMAGEM");
        this.espessura = vo.asBigDecimal("ESPESSURA");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.faturar = vo.asString("FATURAR");
        this.grupoTransg = vo.asBigDecimal("GRUPOTRANSG");
        this.gtinNfe = vo.asString("GTINNFE");
        this.gtinTribNfe = vo.asString("GTINTRIBNFE");
        this.largura = vo.asBigDecimal("LARGURA");
        this.m3 = vo.asBigDecimal("M3");
        this.marca = vo.asString("MARCA");
        this.ncm = vo.asString("NCM");
        this.nrSerieReserva = vo.asString("NRSERIERESERVA");
        this.numPedido2 = vo.asString("NUMPEDIDO2");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuPromocao = vo.asBigDecimal("NUPROMOCAO");
        this.nuTab = vo.asBigDecimal("NUTAB");
        this.observacao = vo.asString("OBSERVACAO");
        this.origProd = vo.asString("ORIGPROD");
        this.pendente = vo.asString("PENDENTE");
        this.percCom = vo.asBigDecimal("PERCCOM");
        this.percComGer = vo.asBigDecimal("PERCCOMGER");
        this.percDesc = vo.asBigDecimal("PERCDESC");
        this.percDescBase = vo.asBigDecimal("PERCDESCBASE");
        this.percDescBonif = vo.asBigDecimal("PERCDESCBONIF");
        this.percDescDigitado = vo.asBigDecimal("PERCDESCDIGITADO");
        this.percDescProm = vo.asBigDecimal("PERCDESCPROM");
        this.percDescTgfdes = vo.asBigDecimal("PERCDESCTGFDES");
        this.percGermin = vo.asBigDecimal("PERCGERMIN");
        this.percPureza = vo.asBigDecimal("PERCPUREZA");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.pesoLiq = vo.asBigDecimal("PESOLIQ");
        this.precoBase = vo.asBigDecimal("PRECOBASE");
        this.precoBaseQtd = vo.asBigDecimal("PRECOBASEQTD");
        this.produtoNfe = vo.asString("PRODUTONFE");
        this.qtdConferida = vo.asBigDecimal("QTDCONFERIDA");
        this.qtdEntregue = vo.asBigDecimal("QTDENTREGUE");
        this.qtdFat = vo.asBigDecimal("QTDFAT");
        this.qtdFixada = vo.asBigDecimal("QTDFIXADA");
        this.qtdFormula = vo.asBigDecimal("QTDFORMULA");
        this.qtdNeg = vo.asBigDecimal("QTDNEG");
        this.qtdPeca = vo.asBigDecimal("QTDPECA");
        this.qtdPendente = vo.asBigDecimal("QTDPENDENTE");
        this.qtdUnidPad = vo.asBigDecimal("QTDUNIDPAD");
        this.qtdWms = vo.asBigDecimal("QTDWMS");
        this.referencia = vo.asString("REFERENCIA");
        this.refForn = vo.asString("REFFORN");
        this.reserva = vo.asString("RESERVA");
        this.seqPedido2 = vo.asString("SEQPEDIDO2");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.solCompra = vo.asString("SOLCOMPRA");
        this.statusLote = vo.asString("STATUSLOTE");
        this.statusNota = vo.asString("STATUSNOTA");
        this.altPreco = vo.asString("ALTPRECO");
        this.altura = vo.asBigDecimal("ALTURA");
        this.qtdVol = vo.asBigDecimal("QTDVOL");
        this.dtInicio = vo.asTimestamp("DTINICIO");
        this.aliqStExtraNota = vo.asBigDecimal("ALIQSTEXTRANOTA");
        this.aliqStFcpStAnt = vo.asBigDecimal("ALIQSTFCPSTANT");
        this.baseStExtraNota = vo.asBigDecimal("BASESTEXTRANOTA");
        this.origemBusca = vo.asString("ORIGEMBUSCA");
        this.produtoPesquisado = vo.asBigDecimal("PRODUTOPESQUISADO");
        this.qtdTribExport = vo.asBigDecimal("QTDTRIBEXPORT");
        this.reservado = vo.asBigDecimal("RESERVADO");
        this.vlrRepRedSemDesc = vo.asBigDecimal("VLRREPREDSEMDESC");
        this.vlrTotLiqRef = vo.asBigDecimal("VLRTOTLIQREF");
        this.vlrVendaPromo = vo.asBigDecimal("VLRVENDAPROMO");
        this.nuFop = vo.asBigDecimal("NUFOP");
        this.sequenciaFiscal = vo.asBigDecimal("SEQUENCIAFISCAL");
        this.codLocalTerc = vo.asBigDecimal("CODLOCALTERC");
        this.percStFcpIntAnt = vo.asBigDecimal("PERCSTFCPINTANT");
        this.vlrStFcpIntAnt = vo.asBigDecimal("VLRSTFCPINTANT");
        this.baseStFcpIntAnt = vo.asBigDecimal("BASESTFCPINTANT");
        this.indEscala = vo.asString("INDESCALA");
        this.codBenefNauf = vo.asString("CODBENEFNAUF");
        this.cnpjFabricante = vo.asString("CNPJFABRICANTE");
        this.codAgregacao = vo.asString("CODAGREGACAO");
        this.percRedVlrIpi = vo.asBigDecimal("PERCREDVLRIPI");
        this.codDocArrecad = vo.asBigDecimal("CODDOCARRECAD");
        this.numDocArrecad = vo.asString("NUMDOCARRECAD");
        this.baseCalcStExtraNota = vo.asBigDecimal("BASECALCSTEXTRANOTA");
        this.margLucro = vo.asBigDecimal("MARGLUCRO");
        this.redBaseSt = vo.asBigDecimal("REDBASEST");
        this.vlrIcmsDiferido = vo.asBigDecimal("VLRICMSDIFERIDO");
        this.tipoSeparacao = vo.asString("TIPOSEPARACAO");
        this.nroProcesso = vo.asString("NROPROCESSO");
        this.baseSubstitUnitOrig = vo.asBigDecimal("BASESUBSTITUNITORIG");
        this.vlrSubstitUnitOrig = vo.asBigDecimal("VLRSUBSTUNITORIG");
        this.percDescFornecedor = vo.asBigDecimal("PERCDESCFORNECEDOR");
        this.statusProc = vo.asString("STATUSPROC");
        this.operAtual = vo.asString("OPERATUAL");
        this.geraProducao = vo.asString("GERAPRODUCAO");
        this.icmsStFrete = vo.asBigDecimal("ICMSSTFRETE");
        this.idAliqIcmsDifIcms = vo.asBigDecimal("IDALIQICMSDIFICMS");
        this.codBarraPdv = vo.asString("CODBARRAPDV");
        this.aliqFetHab = vo.asBigDecimal("ALIQFETHAB");
        this.vlrFetHab = vo.asBigDecimal("VLRFETHAB");
        this.codSit08Efd = vo.asString("CODSIT08EFD");
        this.aliqFuntTel = vo.asBigDecimal("ALIQFUNTTEL");
        this.aliqFust = vo.asBigDecimal("ALIQFUST");
        this.baseFuntTel = vo.asBigDecimal("BASEFUNTTEL");
        this.baseFust = vo.asBigDecimal("BASEFUST");
        this.vlrFuntTel = vo.asBigDecimal("VLRFUNTTEL");
        this.vlrFust = vo.asBigDecimal("VLRFUST");
        this.tipUtilCom = vo.asBigDecimal("TIPUTILCOM");
        this.percUsaquDecpe = vo.asBigDecimal("PERCUSAQUDECPE");
        this.vlrCusAquDecpe = vo.asBigDecimal("VLRCUSAQUDECPE");
        this.baseIcmsStFrete = vo.asBigDecimal("BASEICMSSTFRETE");
        this.codMotDesoneraSt = vo.asBigDecimal("CODMOTDESONERAST");
        this.vlrRepRedSt = vo.asBigDecimal("VLRREPREDST");
        this.unidade = vo.asString("UNIDADE");
        this.tipEntrega = vo.asString("TIPENTREGA");
        this.aliqIcmsAt = vo.asBigDecimal("ALIQICMSAT");
        this.aliqInterIcmsAt = vo.asBigDecimal("ALIQINTERICMSAT");
        this.baseIcmsAt = vo.asBigDecimal("BASEICMSAT");
        this.idAliqIcmsAt = vo.asBigDecimal("IDALIQICMSAT");
        this.vlrIcmsAt = vo.asBigDecimal("VLRICMSAT");
        this.idDescParceria = vo.asBigDecimal("IDDESCPARCERIA");
        this.vlrDescParceria = vo.asBigDecimal("VLRDESCPARCERIA");
        this.codFci = vo.asString("CODFCI");
        this.percUsaquDecpeEst = vo.asBigDecimal("PERCUSAQUDECPEEST");
        this.codIpi = vo.asBigDecimal("CODIPI");
        this.idAliqIss = vo.asBigDecimal("IDALIQISS");
        this.codNatRend = vo.asBigDecimal("CODNATREND");
        this.indRepDes = vo.asString("INDREPDES");
        return this;
   }
}
