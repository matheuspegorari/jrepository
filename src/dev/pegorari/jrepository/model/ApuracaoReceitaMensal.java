package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ApuracaoReceitaMensal extends AbstractSankhyaEntity<ApuracaoReceitaMensal> {
   private String ativo;
   private BigDecimal codEmp;
   private Timestamp dtRef;
   private BigDecimal fatorR;
   private BigDecimal nuApuracao;
   private String status;
   private String tipoInsercao;
   private BigDecimal vlrTotRecAcum;
   private BigDecimal vlrTotRecAcumExt;
   private BigDecimal vlrTotRecAcumInt;
   private BigDecimal vlrTotRecMen;
   private BigDecimal vlrTotRecMenExt;
   private BigDecimal vlrTotRecMenInt;
   private BigDecimal vlrTotRecProj;
   private BigDecimal vlrTotRecProjExt;
   private BigDecimal vlrTotRecProjInt;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public BigDecimal getFatorR() {
        return fatorR;
   }

   public void setFatorR(BigDecimal fatorR) {
        markAsChanged("FATORR", fatorR);
        this.fatorR = fatorR;
   }

   public BigDecimal getNuApuracao() {
        return nuApuracao;
   }

   public void setNuApuracao(BigDecimal nuApuracao) {
        markAsChanged("NUAPURACAO", nuApuracao);
        this.nuApuracao = nuApuracao;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getTipoInsercao() {
        return tipoInsercao;
   }

   public void setTipoInsercao(String tipoInsercao) {
        markAsChanged("TIPOINSERCAO", tipoInsercao);
        this.tipoInsercao = tipoInsercao;
   }

   public BigDecimal getVlrTotRecAcum() {
        return vlrTotRecAcum;
   }

   public void setVlrTotRecAcum(BigDecimal vlrTotRecAcum) {
        markAsChanged("VLRTOTRECACUM", vlrTotRecAcum);
        this.vlrTotRecAcum = vlrTotRecAcum;
   }

   public BigDecimal getVlrTotRecAcumExt() {
        return vlrTotRecAcumExt;
   }

   public void setVlrTotRecAcumExt(BigDecimal vlrTotRecAcumExt) {
        markAsChanged("VLRTOTRECACUMEXT", vlrTotRecAcumExt);
        this.vlrTotRecAcumExt = vlrTotRecAcumExt;
   }

   public BigDecimal getVlrTotRecAcumInt() {
        return vlrTotRecAcumInt;
   }

   public void setVlrTotRecAcumInt(BigDecimal vlrTotRecAcumInt) {
        markAsChanged("VLRTOTRECACUMINT", vlrTotRecAcumInt);
        this.vlrTotRecAcumInt = vlrTotRecAcumInt;
   }

   public BigDecimal getVlrTotRecMen() {
        return vlrTotRecMen;
   }

   public void setVlrTotRecMen(BigDecimal vlrTotRecMen) {
        markAsChanged("VLRTOTRECMEN", vlrTotRecMen);
        this.vlrTotRecMen = vlrTotRecMen;
   }

   public BigDecimal getVlrTotRecMenExt() {
        return vlrTotRecMenExt;
   }

   public void setVlrTotRecMenExt(BigDecimal vlrTotRecMenExt) {
        markAsChanged("VLRTOTRECMENEXT", vlrTotRecMenExt);
        this.vlrTotRecMenExt = vlrTotRecMenExt;
   }

   public BigDecimal getVlrTotRecMenInt() {
        return vlrTotRecMenInt;
   }

   public void setVlrTotRecMenInt(BigDecimal vlrTotRecMenInt) {
        markAsChanged("VLRTOTRECMENINT", vlrTotRecMenInt);
        this.vlrTotRecMenInt = vlrTotRecMenInt;
   }

   public BigDecimal getVlrTotRecProj() {
        return vlrTotRecProj;
   }

   public void setVlrTotRecProj(BigDecimal vlrTotRecProj) {
        markAsChanged("VLRTOTRECPROJ", vlrTotRecProj);
        this.vlrTotRecProj = vlrTotRecProj;
   }

   public BigDecimal getVlrTotRecProjExt() {
        return vlrTotRecProjExt;
   }

   public void setVlrTotRecProjExt(BigDecimal vlrTotRecProjExt) {
        markAsChanged("VLRTOTRECPROJEXT", vlrTotRecProjExt);
        this.vlrTotRecProjExt = vlrTotRecProjExt;
   }

   public BigDecimal getVlrTotRecProjInt() {
        return vlrTotRecProjInt;
   }

   public void setVlrTotRecProjInt(BigDecimal vlrTotRecProjInt) {
        markAsChanged("VLRTOTRECPROJINT", vlrTotRecProjInt);
        this.vlrTotRecProjInt = vlrTotRecProjInt;
   }

   @Override
   public String getTableName() {
        return "TGFARM";
   }

   @Override
   public String getEntityName() {
        return "ApuracaoReceitaMensal";
   }

   @Override
   public ApuracaoReceitaMensal fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtRef = vo.asTimestamp("DTREF");
        this.fatorR = vo.asBigDecimal("FATORR");
        this.nuApuracao = vo.asBigDecimal("NUAPURACAO");
        this.status = vo.asString("STATUS");
        this.tipoInsercao = vo.asString("TIPOINSERCAO");
        this.vlrTotRecAcum = vo.asBigDecimal("VLRTOTRECACUM");
        this.vlrTotRecAcumExt = vo.asBigDecimal("VLRTOTRECACUMEXT");
        this.vlrTotRecAcumInt = vo.asBigDecimal("VLRTOTRECACUMINT");
        this.vlrTotRecMen = vo.asBigDecimal("VLRTOTRECMEN");
        this.vlrTotRecMenExt = vo.asBigDecimal("VLRTOTRECMENEXT");
        this.vlrTotRecMenInt = vo.asBigDecimal("VLRTOTRECMENINT");
        this.vlrTotRecProj = vo.asBigDecimal("VLRTOTRECPROJ");
        this.vlrTotRecProjExt = vo.asBigDecimal("VLRTOTRECPROJEXT");
        this.vlrTotRecProjInt = vo.asBigDecimal("VLRTOTRECPROJINT");
        return this;
   }
}
