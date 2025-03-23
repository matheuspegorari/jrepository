package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoST extends AbstractSankhyaEntity<DemonsApurRessarcimentoST> {
   private String arqConfirmado;
   private BigDecimal codEmp;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private Timestamp dtInv;
   private BigDecimal finApresentacao;
   private String indPerfil;
   private BigDecimal versaoLayout;
   private String tipEstoque;
   private BigDecimal aliqEfetiva;
   private String listNotasReg2113Tip10;
   private String listNotasReg2113Tip20;
   private String listNotasReg2113Tip30;
   private String listNotasReg2130;
   private String percSt60SemVlrAnt;
   private String percMvndCst60;

   public String getArqConfirmado() {
        return arqConfirmado;
   }

   public void setArqConfirmado(String arqConfirmado) {
        markAsChanged("ARQCONFIRMADO", arqConfirmado);
        this.arqConfirmado = arqConfirmado;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
        this.dtInicial = dtInicial;
   }

   public Timestamp getDtInv() {
        return dtInv;
   }

   public void setDtInv(Timestamp dtInv) {
        markAsChanged("DTINV", dtInv);
        this.dtInv = dtInv;
   }

   public BigDecimal getFinApresentacao() {
        return finApresentacao;
   }

   public void setFinApresentacao(BigDecimal finApresentacao) {
        markAsChanged("FINAPRESENTACAO", finApresentacao);
        this.finApresentacao = finApresentacao;
   }

   public String getIndPerfil() {
        return indPerfil;
   }

   public void setIndPerfil(String indPerfil) {
        markAsChanged("INDPERFIL", indPerfil);
        this.indPerfil = indPerfil;
   }

   public BigDecimal getVersaoLayout() {
        return versaoLayout;
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
        this.versaoLayout = versaoLayout;
   }

   public String getTipEstoque() {
        return tipEstoque;
   }

   public void setTipEstoque(String tipEstoque) {
        markAsChanged("TIPESTOQUE", tipEstoque);
        this.tipEstoque = tipEstoque;
   }

   public BigDecimal getAliqEfetiva() {
        return aliqEfetiva;
   }

   public void setAliqEfetiva(BigDecimal aliqEfetiva) {
        markAsChanged("ALIQEFETIVA", aliqEfetiva);
        this.aliqEfetiva = aliqEfetiva;
   }

   public String getListNotasReg2113Tip10() {
        return listNotasReg2113Tip10;
   }

   public void setListNotasReg2113Tip10(String listNotasReg2113Tip10) {
        markAsChanged("LISTNOTASREG2113TIP10", listNotasReg2113Tip10);
        this.listNotasReg2113Tip10 = listNotasReg2113Tip10;
   }

   public String getListNotasReg2113Tip20() {
        return listNotasReg2113Tip20;
   }

   public void setListNotasReg2113Tip20(String listNotasReg2113Tip20) {
        markAsChanged("LISTNOTASREG2113TIP20", listNotasReg2113Tip20);
        this.listNotasReg2113Tip20 = listNotasReg2113Tip20;
   }

   public String getListNotasReg2113Tip30() {
        return listNotasReg2113Tip30;
   }

   public void setListNotasReg2113Tip30(String listNotasReg2113Tip30) {
        markAsChanged("LISTNOTASREG2113TIP30", listNotasReg2113Tip30);
        this.listNotasReg2113Tip30 = listNotasReg2113Tip30;
   }

   public String getListNotasReg2130() {
        return listNotasReg2130;
   }

   public void setListNotasReg2130(String listNotasReg2130) {
        markAsChanged("LISTNOTASREG2130", listNotasReg2130);
        this.listNotasReg2130 = listNotasReg2130;
   }

   public String getPercSt60SemVlrAnt() {
        return percSt60SemVlrAnt;
   }

   public void setPercSt60SemVlrAnt(String percSt60SemVlrAnt) {
        markAsChanged("PERCST60SEMVLRANT", percSt60SemVlrAnt);
        this.percSt60SemVlrAnt = percSt60SemVlrAnt;
   }

   public String getPercMvndCst60() {
        return percMvndCst60;
   }

   public void setPercMvndCst60(String percMvndCst60) {
        markAsChanged("PERMVNDCST60", percMvndCst60);
        this.percMvndCst60 = percMvndCst60;
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
        this.arqConfirmado = vo.asString("ARQCONFIRMADO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.dtInv = vo.asTimestamp("DTINV");
        this.finApresentacao = vo.asBigDecimal("FINAPRESENTACAO");
        this.indPerfil = vo.asString("INDPERFIL");
        this.versaoLayout = vo.asBigDecimal("VERSAOLAYOUT");
        this.tipEstoque = vo.asString("TIPESTOQUE");
        this.aliqEfetiva = vo.asBigDecimal("ALIQEFETIVA");
        this.listNotasReg2113Tip10 = vo.asString("LISTNOTASREG2113TIP10");
        this.listNotasReg2113Tip20 = vo.asString("LISTNOTASREG2113TIP20");
        this.listNotasReg2113Tip30 = vo.asString("LISTNOTASREG2113TIP30");
        this.listNotasReg2130 = vo.asString("LISTNOTASREG2130");
        this.percSt60SemVlrAnt = vo.asString("PERCST60SEMVLRANT");
        this.percMvndCst60 = vo.asString("PERMVNDCST60");
        return this;
   }
}
