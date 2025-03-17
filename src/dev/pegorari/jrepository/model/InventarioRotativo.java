package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioRotativo extends AbstractSankhyaEntity<InventarioRotativo> {
   private String ativa;
   private BigDecimal codEmp;
   private BigDecimal codEnd;
   private BigDecimal codLocal;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private String codVol;
   private String controle;
   private Timestamp dhContagem;
   private BigDecimal divergenciaPad;
   private Timestamp dtVal;
   private BigDecimal idPalete;
   private BigDecimal nuAjuste;
   private BigDecimal nuIvt;
   private BigDecimal qtdEstContada;
   private BigDecimal qtdEstContadaPad;
   private BigDecimal qtdEstLogica;
   private BigDecimal qtdEstLogicaPad;
   private BigDecimal sequencia;
   private String tipoDivergencia;
   private BigDecimal divergencia;
   private Timestamp dtRec;
   private BigDecimal qtdEstLogicaUma;
   private BigDecimal qtdEstLogicaUmaPad;

   public String getAtiva() {
        return ativa;
   }

   public void setAtiva(String ativa) {
        this.ativa = ativa;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public Timestamp getDhContagem() {
        return dhContagem;
   }

   public void setDhContagem(Timestamp dhContagem) {
        this.dhContagem = dhContagem;
   }

   public BigDecimal getDivergenciaPad() {
        return divergenciaPad;
   }

   public void setDivergenciaPad(BigDecimal divergenciaPad) {
        this.divergenciaPad = divergenciaPad;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        this.dtVal = dtVal;
   }

   public BigDecimal getIdPalete() {
        return idPalete;
   }

   public void setIdPalete(BigDecimal idPalete) {
        this.idPalete = idPalete;
   }

   public BigDecimal getNuAjuste() {
        return nuAjuste;
   }

   public void setNuAjuste(BigDecimal nuAjuste) {
        this.nuAjuste = nuAjuste;
   }

   public BigDecimal getNuIvt() {
        return nuIvt;
   }

   public void setNuIvt(BigDecimal nuIvt) {
        this.nuIvt = nuIvt;
   }

   public BigDecimal getQtdEstContada() {
        return qtdEstContada;
   }

   public void setQtdEstContada(BigDecimal qtdEstContada) {
        this.qtdEstContada = qtdEstContada;
   }

   public BigDecimal getQtdEstContadaPad() {
        return qtdEstContadaPad;
   }

   public void setQtdEstContadaPad(BigDecimal qtdEstContadaPad) {
        this.qtdEstContadaPad = qtdEstContadaPad;
   }

   public BigDecimal getQtdEstLogica() {
        return qtdEstLogica;
   }

   public void setQtdEstLogica(BigDecimal qtdEstLogica) {
        this.qtdEstLogica = qtdEstLogica;
   }

   public BigDecimal getQtdEstLogicaPad() {
        return qtdEstLogicaPad;
   }

   public void setQtdEstLogicaPad(BigDecimal qtdEstLogicaPad) {
        this.qtdEstLogicaPad = qtdEstLogicaPad;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTipoDivergencia() {
        return tipoDivergencia;
   }

   public void setTipoDivergencia(String tipoDivergencia) {
        this.tipoDivergencia = tipoDivergencia;
   }

   public BigDecimal getDivergencia() {
        return divergencia;
   }

   public void setDivergencia(BigDecimal divergencia) {
        this.divergencia = divergencia;
   }

   public Timestamp getDtRec() {
        return dtRec;
   }

   public void setDtRec(Timestamp dtRec) {
        this.dtRec = dtRec;
   }

   public BigDecimal getQtdEstLogicaUma() {
        return qtdEstLogicaUma;
   }

   public void setQtdEstLogicaUma(BigDecimal qtdEstLogicaUma) {
        this.qtdEstLogicaUma = qtdEstLogicaUma;
   }

   public BigDecimal getQtdEstLogicaUmaPad() {
        return qtdEstLogicaUmaPad;
   }

   public void setQtdEstLogicaUmaPad(BigDecimal qtdEstLogicaUmaPad) {
        this.qtdEstLogicaUmaPad = qtdEstLogicaUmaPad;
   }

   @Override
   public String getTableName() {
        return "TGWIVR";
   }

   @Override
   public String getEntityName() {
        return "InventarioRotativo";
   }

   @Override
   public InventarioRotativo fromVO(DynamicVO vo) {
        this.ativa = vo.asString("ATIVA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.dhContagem = vo.asTimestamp("DHCONTAGEM");
        this.divergenciaPad = vo.asBigDecimal("DIVERGENCIAPAD");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.idPalete = vo.asBigDecimal("IDPALETE");
        this.nuAjuste = vo.asBigDecimal("NUAJUSTE");
        this.nuIvt = vo.asBigDecimal("NUIVT");
        this.qtdEstContada = vo.asBigDecimal("QTDESTCONTADA");
        this.qtdEstContadaPad = vo.asBigDecimal("QTDESTCONTADAPAD");
        this.qtdEstLogica = vo.asBigDecimal("QTDESTLOGICA");
        this.qtdEstLogicaPad = vo.asBigDecimal("QTDESTLOGICAPAD");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoDivergencia = vo.asString("TIPODIVERGENCIA");
        this.divergencia = vo.asBigDecimal("DIVERGENCIA");
        this.dtRec = vo.asTimestamp("DTREC");
        this.qtdEstLogicaUma = vo.asBigDecimal("QTDESTLOGICAUMA");
        this.qtdEstLogicaUmaPad = vo.asBigDecimal("QTDESTLOGICAUMAPAD");
        return this;
   }
}
