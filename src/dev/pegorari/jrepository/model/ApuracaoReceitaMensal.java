package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ApuracaoReceitaMensal extends AbstractSankhyaEntity<ApuracaoReceitaMensal> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getFatorR() {
        return this.getVo().asBigDecimal("FATORR");
   }

   public void setFatorR(BigDecimal fatorR) {
        markAsChanged("FATORR", fatorR);
   }

   public BigDecimal getNuApuracao() {
        return this.getVo().asBigDecimal("NUAPURACAO");
   }

   public void setNuApuracao(BigDecimal nuApuracao) {
        markAsChanged("NUAPURACAO", nuApuracao);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getTipoInsercao() {
        return this.getVo().asString("TIPOINSERCAO");
   }

   public void setTipoInsercao(String tipoInsercao) {
        markAsChanged("TIPOINSERCAO", tipoInsercao);
   }

   public BigDecimal getVlrTotRecAcum() {
        return this.getVo().asBigDecimal("VLRTOTRECACUM");
   }

   public void setVlrTotRecAcum(BigDecimal vlrTotRecAcum) {
        markAsChanged("VLRTOTRECACUM", vlrTotRecAcum);
   }

   public BigDecimal getVlrTotRecAcumExt() {
        return this.getVo().asBigDecimal("VLRTOTRECACUMEXT");
   }

   public void setVlrTotRecAcumExt(BigDecimal vlrTotRecAcumExt) {
        markAsChanged("VLRTOTRECACUMEXT", vlrTotRecAcumExt);
   }

   public BigDecimal getVlrTotRecAcumInt() {
        return this.getVo().asBigDecimal("VLRTOTRECACUMINT");
   }

   public void setVlrTotRecAcumInt(BigDecimal vlrTotRecAcumInt) {
        markAsChanged("VLRTOTRECACUMINT", vlrTotRecAcumInt);
   }

   public BigDecimal getVlrTotRecMen() {
        return this.getVo().asBigDecimal("VLRTOTRECMEN");
   }

   public void setVlrTotRecMen(BigDecimal vlrTotRecMen) {
        markAsChanged("VLRTOTRECMEN", vlrTotRecMen);
   }

   public BigDecimal getVlrTotRecMenExt() {
        return this.getVo().asBigDecimal("VLRTOTRECMENEXT");
   }

   public void setVlrTotRecMenExt(BigDecimal vlrTotRecMenExt) {
        markAsChanged("VLRTOTRECMENEXT", vlrTotRecMenExt);
   }

   public BigDecimal getVlrTotRecMenInt() {
        return this.getVo().asBigDecimal("VLRTOTRECMENINT");
   }

   public void setVlrTotRecMenInt(BigDecimal vlrTotRecMenInt) {
        markAsChanged("VLRTOTRECMENINT", vlrTotRecMenInt);
   }

   public BigDecimal getVlrTotRecProj() {
        return this.getVo().asBigDecimal("VLRTOTRECPROJ");
   }

   public void setVlrTotRecProj(BigDecimal vlrTotRecProj) {
        markAsChanged("VLRTOTRECPROJ", vlrTotRecProj);
   }

   public BigDecimal getVlrTotRecProjExt() {
        return this.getVo().asBigDecimal("VLRTOTRECPROJEXT");
   }

   public void setVlrTotRecProjExt(BigDecimal vlrTotRecProjExt) {
        markAsChanged("VLRTOTRECPROJEXT", vlrTotRecProjExt);
   }

   public BigDecimal getVlrTotRecProjInt() {
        return this.getVo().asBigDecimal("VLRTOTRECPROJINT");
   }

   public void setVlrTotRecProjInt(BigDecimal vlrTotRecProjInt) {
        markAsChanged("VLRTOTRECPROJINT", vlrTotRecProjInt);
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
        this.setVo(vo);
        return this;
   }
}
