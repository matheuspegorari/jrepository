package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParametroSistema extends AbstractSankhyaEntity<ParametroSistema> {
   public String getAba() {
        return this.getVo().asString("ABA");
   }

   public void setAba(String aba) {
        markAsChanged("ABA", aba);
   }

   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public String getClasse() {
        return this.getVo().asString("CLASSE");
   }

   public void setClasse(String classe) {
        markAsChanged("CLASSE", classe);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getData() {
        return this.getVo().asTimestamp("DATA");
   }

   public void setData(Timestamp data) {
        markAsChanged("DATA", data);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getInteiro() {
        return this.getVo().asBigDecimal("INTEIRO");
   }

   public void setInteiro(BigDecimal inteiro) {
        markAsChanged("INTEIRO", inteiro);
   }

   public String getLogico() {
        return this.getVo().asString("LOGICO");
   }

   public void setLogico(String logico) {
        markAsChanged("LOGICO", logico);
   }

   public String getModulo() {
        return this.getVo().asString("MODULO");
   }

   public void setModulo(String modulo) {
        markAsChanged("MODULO", modulo);
   }

   public BigDecimal getNumDec() {
        return this.getVo().asBigDecimal("NUMDEC");
   }

   public void setNumDec(BigDecimal numDec) {
        markAsChanged("NUMDEC", numDec);
   }

   public String getTexto() {
        return this.getVo().asString("TEXTO");
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TSIPAR";
   }

   @Override
   public String getEntityName() {
        return "ParametroSistema";
   }

   @Override
   public ParametroSistema fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
