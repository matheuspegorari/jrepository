package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParametroSistema implements SankhyaEntity<ParametroSistema> {

   private String aba;
   private String chave;
   private String classe;
   private BigDecimal codUsu;
   private Timestamp data;
   private String descricao;
   private BigDecimal inteiro;
   private String logico;
   private String modulo;
   private BigDecimal numDec;
   private String texto;
   private String tipo;

   public String getAba() {
        return aba;
   }

   public void setAba(String aba) {
        this.aba = aba;
   }

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public String getClasse() {
        return classe;
   }

   public void setClasse(String classe) {
        this.classe = classe;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getData() {
        return data;
   }

   public void setData(Timestamp data) {
        this.data = data;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getInteiro() {
        return inteiro;
   }

   public void setInteiro(BigDecimal inteiro) {
        this.inteiro = inteiro;
   }

   public String getLogico() {
        return logico;
   }

   public void setLogico(String logico) {
        this.logico = logico;
   }

   public String getModulo() {
        return modulo;
   }

   public void setModulo(String modulo) {
        this.modulo = modulo;
   }

   public BigDecimal getNumDec() {
        return numDec;
   }

   public void setNumDec(BigDecimal numDec) {
        this.numDec = numDec;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        this.texto = texto;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "ParametroSistema";
   }

   @Override
   public ParametroSistema fromVO(DynamicVO vo) {
        this.aba = vo.asString("ABA");
        this.chave = vo.asString("CHAVE");
        this.classe = vo.asString("CLASSE");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.data = vo.asTimestamp("DATA");
        this.descricao = vo.asString("DESCRICAO");
        this.inteiro = vo.asBigDecimal("INTEIRO");
        this.logico = vo.asString("LOGICO");
        this.modulo = vo.asString("MODULO");
        this.numDec = vo.asBigDecimal("NUMDEC");
        this.texto = vo.asString("TEXTO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
