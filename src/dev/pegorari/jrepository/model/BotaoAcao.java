package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class BotaoAcao extends AbstractSankhyaEntity<BotaoAcao> {
   private BigDecimal codModulo;
   private char[] config;
   private String controlaAcesso;
   private String descricao;
   private BigDecimal idBtnAcao;
   private String nomeInstancia;
   private BigDecimal ordem;
   private String resourceId;
   private String tipo;
   private String teclaAtalho;

   public BigDecimal getCodModulo() {
        return codModulo;
   }

   public void setCodModulo(BigDecimal codModulo) {
        this.codModulo = codModulo;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        this.config = config;
   }

   public String getControlaAcesso() {
        return controlaAcesso;
   }

   public void setControlaAcesso(String controlaAcesso) {
        this.controlaAcesso = controlaAcesso;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getIdBtnAcao() {
        return idBtnAcao;
   }

   public void setIdBtnAcao(BigDecimal idBtnAcao) {
        this.idBtnAcao = idBtnAcao;
   }

   public String getNomeInstancia() {
        return nomeInstancia;
   }

   public void setNomeInstancia(String nomeInstancia) {
        this.nomeInstancia = nomeInstancia;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getResourceId() {
        return resourceId;
   }

   public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTeclaAtalho() {
        return teclaAtalho;
   }

   public void setTeclaAtalho(String teclaAtalho) {
        this.teclaAtalho = teclaAtalho;
   }

   @Override
   public String getTableName() {
        return "TSIBTA";
   }

   @Override
   public String getEntityName() {
        return "BotaoAcao";
   }

   @Override
   public BotaoAcao fromVO(DynamicVO vo) {
        this.codModulo = vo.asBigDecimal("CODMODULO");
        this.config = vo.asClob("CONFIG");
        this.controlaAcesso = vo.asString("CONTROLAACESSO");
        this.descricao = vo.asString("DESCRICAO");
        this.idBtnAcao = vo.asBigDecimal("IDBTNACAO");
        this.nomeInstancia = vo.asString("NOMEINSTANCIA");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.resourceId = vo.asString("RESOURCEID");
        this.tipo = vo.asString("TIPO");
        this.teclaAtalho = vo.asString("TECLAATALHO");
        return this;
   }
}
