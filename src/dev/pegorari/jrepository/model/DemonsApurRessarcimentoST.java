package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoST extends AbstractSankhyaEntity<DemonsApurRessarcimentoST> {
   public String getArqConfirmado() {
        return this.getVo().asString("ARQCONFIRMADO");
   }

   public void setArqConfirmado(String arqConfirmado) {
        markAsChanged("ARQCONFIRMADO", arqConfirmado);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public Timestamp getDtInv() {
        return this.getVo().asTimestamp("DTINV");
   }

   public void setDtInv(Timestamp dtInv) {
        markAsChanged("DTINV", dtInv);
   }

   public BigDecimal getFinApresentacao() {
        return this.getVo().asBigDecimal("FINAPRESENTACAO");
   }

   public void setFinApresentacao(BigDecimal finApresentacao) {
        markAsChanged("FINAPRESENTACAO", finApresentacao);
   }

   public String getIndPerfil() {
        return this.getVo().asString("INDPERFIL");
   }

   public void setIndPerfil(String indPerfil) {
        markAsChanged("INDPERFIL", indPerfil);
   }

   public BigDecimal getVersaoLayout() {
        return this.getVo().asBigDecimal("VERSAOLAYOUT");
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
   }

   public String getTipEstoque() {
        return this.getVo().asString("TIPESTOQUE");
   }

   public void setTipEstoque(String tipEstoque) {
        markAsChanged("TIPESTOQUE", tipEstoque);
   }

   public BigDecimal getAliqEfetiva() {
        return this.getVo().asBigDecimal("ALIQEFETIVA");
   }

   public void setAliqEfetiva(BigDecimal aliqEfetiva) {
        markAsChanged("ALIQEFETIVA", aliqEfetiva);
   }

   public String getListNotasReg2113Tip10() {
        return this.getVo().asString("LISTNOTASREG2113TIP10");
   }

   public void setListNotasReg2113Tip10(String listNotasReg2113Tip10) {
        markAsChanged("LISTNOTASREG2113TIP10", listNotasReg2113Tip10);
   }

   public String getListNotasReg2113Tip20() {
        return this.getVo().asString("LISTNOTASREG2113TIP20");
   }

   public void setListNotasReg2113Tip20(String listNotasReg2113Tip20) {
        markAsChanged("LISTNOTASREG2113TIP20", listNotasReg2113Tip20);
   }

   public String getListNotasReg2113Tip30() {
        return this.getVo().asString("LISTNOTASREG2113TIP30");
   }

   public void setListNotasReg2113Tip30(String listNotasReg2113Tip30) {
        markAsChanged("LISTNOTASREG2113TIP30", listNotasReg2113Tip30);
   }

   public String getListNotasReg2130() {
        return this.getVo().asString("LISTNOTASREG2130");
   }

   public void setListNotasReg2130(String listNotasReg2130) {
        markAsChanged("LISTNOTASREG2130", listNotasReg2130);
   }

   public String getPercSt60SemVlrAnt() {
        return this.getVo().asString("PERCST60SEMVLRANT");
   }

   public void setPercSt60SemVlrAnt(String percSt60SemVlrAnt) {
        markAsChanged("PERCST60SEMVLRANT", percSt60SemVlrAnt);
   }

   public String getPercMvndCst60() {
        return this.getVo().asString("PERMVNDCST60");
   }

   public void setPercMvndCst60(String percMvndCst60) {
        markAsChanged("PERMVNDCST60", percMvndCst60);
   }

   @Override
   public String getTableName() {
        return "TGFDRCST";
   }

   @Override
   public String getEntityName() {
        return "DemonsApurRessarcimentoST";
   }

   @Override
   public DemonsApurRessarcimentoST fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
