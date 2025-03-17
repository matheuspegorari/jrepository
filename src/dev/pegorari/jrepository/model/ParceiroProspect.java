package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParceiroProspect extends AbstractSankhyaEntity<ParceiroProspect> {
   private Timestamp dhCadSefaz;
   private String sitCadSefaz;
   private String cgcCpf;
   private BigDecimal codPap;
   private BigDecimal codParc;
   private BigDecimal codParcB2b;
   private BigDecimal codTipParc;
   private BigDecimal codUf;
   private BigDecimal codVend;
   private String complemento;
   private Timestamp dataEmissaoRg;
   private BigDecimal diaPagto;
   private Timestamp dtCad;
   private Timestamp dtNasc;
   private String email;
   private String emissaoRg;
   private String endereco;
   private String escolaridade;
   private String estadoCivil;
   private String identInscEstad;
   private String isPropostaCartao;
   private BigDecimal limCred;
   private BigDecimal naturalidade;
   private String nomeBai;
   private String nomeCartao;
   private String nomeCid;
   private String nomeConjuge;
   private String nomeMae;
   private String nomePai;
   private String nomePap;
   private BigDecimal nroAns;
   private BigDecimal nroBen;
   private String numEnd;
   private String observacoes;
   private String possuiCartaoCredito;
   private BigDecimal qtdeDependentes;
   private String razaoSocial;
   private String rg;
   private String sexo;
   private String statusProposta;
   private String telCelular;
   private String telefone;
   private String tipoResidencia;
   private String tipPessoa;
   private BigDecimal ufRg;
   private String cartaoCredito;
   private BigDecimal carteiraTrab;
   private String celularConjuge;
   private String cep;
   private String cnae;
   private Timestamp dhCadRf;
   private Timestamp dtBaixa;
   private Timestamp dtIniAtiv;
   private Timestamp dtUltSit;
   private BigDecimal indCredCte;
   private BigDecimal indCredNfe;
   private String regApur;
   private BigDecimal sitCadRf;
   private BigDecimal intervAnalisCred;

   public Timestamp getDhCadSefaz() {
        return dhCadSefaz;
   }

   public void setDhCadSefaz(Timestamp dhCadSefaz) {
        this.dhCadSefaz = dhCadSefaz;
   }

   public String getSitCadSefaz() {
        return sitCadSefaz;
   }

   public void setSitCadSefaz(String sitCadSefaz) {
        this.sitCadSefaz = sitCadSefaz;
   }

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        this.cgcCpf = cgcCpf;
   }

   public BigDecimal getCodPap() {
        return codPap;
   }

   public void setCodPap(BigDecimal codPap) {
        this.codPap = codPap;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodParcB2b() {
        return codParcB2b;
   }

   public void setCodParcB2b(BigDecimal codParcB2b) {
        this.codParcB2b = codParcB2b;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        this.codTipParc = codTipParc;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        this.codUf = codUf;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        this.complemento = complemento;
   }

   public Timestamp getDataEmissaoRg() {
        return dataEmissaoRg;
   }

   public void setDataEmissaoRg(Timestamp dataEmissaoRg) {
        this.dataEmissaoRg = dataEmissaoRg;
   }

   public BigDecimal getDiaPagto() {
        return diaPagto;
   }

   public void setDiaPagto(BigDecimal diaPagto) {
        this.diaPagto = diaPagto;
   }

   public Timestamp getDtCad() {
        return dtCad;
   }

   public void setDtCad(Timestamp dtCad) {
        this.dtCad = dtCad;
   }

   public Timestamp getDtNasc() {
        return dtNasc;
   }

   public void setDtNasc(Timestamp dtNasc) {
        this.dtNasc = dtNasc;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public String getEmissaoRg() {
        return emissaoRg;
   }

   public void setEmissaoRg(String emissaoRg) {
        this.emissaoRg = emissaoRg;
   }

   public String getEndereco() {
        return endereco;
   }

   public void setEndereco(String endereco) {
        this.endereco = endereco;
   }

   public String getEscolaridade() {
        return escolaridade;
   }

   public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
   }

   public String getEstadoCivil() {
        return estadoCivil;
   }

   public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
   }

   public String getIdentInscEstad() {
        return identInscEstad;
   }

   public void setIdentInscEstad(String identInscEstad) {
        this.identInscEstad = identInscEstad;
   }

   public String getIsPropostaCartao() {
        return isPropostaCartao;
   }

   public void setIsPropostaCartao(String isPropostaCartao) {
        this.isPropostaCartao = isPropostaCartao;
   }

   public BigDecimal getLimCred() {
        return limCred;
   }

   public void setLimCred(BigDecimal limCred) {
        this.limCred = limCred;
   }

   public BigDecimal getNaturalidade() {
        return naturalidade;
   }

   public void setNaturalidade(BigDecimal naturalidade) {
        this.naturalidade = naturalidade;
   }

   public String getNomeBai() {
        return nomeBai;
   }

   public void setNomeBai(String nomeBai) {
        this.nomeBai = nomeBai;
   }

   public String getNomeCartao() {
        return nomeCartao;
   }

   public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
   }

   public String getNomeCid() {
        return nomeCid;
   }

   public void setNomeCid(String nomeCid) {
        this.nomeCid = nomeCid;
   }

   public String getNomeConjuge() {
        return nomeConjuge;
   }

   public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
   }

   public String getNomeMae() {
        return nomeMae;
   }

   public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
   }

   public String getNomePai() {
        return nomePai;
   }

   public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
   }

   public String getNomePap() {
        return nomePap;
   }

   public void setNomePap(String nomePap) {
        this.nomePap = nomePap;
   }

   public BigDecimal getNroAns() {
        return nroAns;
   }

   public void setNroAns(BigDecimal nroAns) {
        this.nroAns = nroAns;
   }

   public BigDecimal getNroBen() {
        return nroBen;
   }

   public void setNroBen(BigDecimal nroBen) {
        this.nroBen = nroBen;
   }

   public String getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(String numEnd) {
        this.numEnd = numEnd;
   }

   public String getObservacoes() {
        return observacoes;
   }

   public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
   }

   public String getPossuiCartaoCredito() {
        return possuiCartaoCredito;
   }

   public void setPossuiCartaoCredito(String possuiCartaoCredito) {
        this.possuiCartaoCredito = possuiCartaoCredito;
   }

   public BigDecimal getQtdeDependentes() {
        return qtdeDependentes;
   }

   public void setQtdeDependentes(BigDecimal qtdeDependentes) {
        this.qtdeDependentes = qtdeDependentes;
   }

   public String getRazaoSocial() {
        return razaoSocial;
   }

   public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
   }

   public String getRg() {
        return rg;
   }

   public void setRg(String rg) {
        this.rg = rg;
   }

   public String getSexo() {
        return sexo;
   }

   public void setSexo(String sexo) {
        this.sexo = sexo;
   }

   public String getStatusProposta() {
        return statusProposta;
   }

   public void setStatusProposta(String statusProposta) {
        this.statusProposta = statusProposta;
   }

   public String getTelCelular() {
        return telCelular;
   }

   public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        this.telefone = telefone;
   }

   public String getTipoResidencia() {
        return tipoResidencia;
   }

   public void setTipoResidencia(String tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
   }

   public String getTipPessoa() {
        return tipPessoa;
   }

   public void setTipPessoa(String tipPessoa) {
        this.tipPessoa = tipPessoa;
   }

   public BigDecimal getUfRg() {
        return ufRg;
   }

   public void setUfRg(BigDecimal ufRg) {
        this.ufRg = ufRg;
   }

   public String getCartaoCredito() {
        return cartaoCredito;
   }

   public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
   }

   public BigDecimal getCarteiraTrab() {
        return carteiraTrab;
   }

   public void setCarteiraTrab(BigDecimal carteiraTrab) {
        this.carteiraTrab = carteiraTrab;
   }

   public String getCelularConjuge() {
        return celularConjuge;
   }

   public void setCelularConjuge(String celularConjuge) {
        this.celularConjuge = celularConjuge;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        this.cep = cep;
   }

   public String getCnae() {
        return cnae;
   }

   public void setCnae(String cnae) {
        this.cnae = cnae;
   }

   public Timestamp getDhCadRf() {
        return dhCadRf;
   }

   public void setDhCadRf(Timestamp dhCadRf) {
        this.dhCadRf = dhCadRf;
   }

   public Timestamp getDtBaixa() {
        return dtBaixa;
   }

   public void setDtBaixa(Timestamp dtBaixa) {
        this.dtBaixa = dtBaixa;
   }

   public Timestamp getDtIniAtiv() {
        return dtIniAtiv;
   }

   public void setDtIniAtiv(Timestamp dtIniAtiv) {
        this.dtIniAtiv = dtIniAtiv;
   }

   public Timestamp getDtUltSit() {
        return dtUltSit;
   }

   public void setDtUltSit(Timestamp dtUltSit) {
        this.dtUltSit = dtUltSit;
   }

   public BigDecimal getIndCredCte() {
        return indCredCte;
   }

   public void setIndCredCte(BigDecimal indCredCte) {
        this.indCredCte = indCredCte;
   }

   public BigDecimal getIndCredNfe() {
        return indCredNfe;
   }

   public void setIndCredNfe(BigDecimal indCredNfe) {
        this.indCredNfe = indCredNfe;
   }

   public String getRegApur() {
        return regApur;
   }

   public void setRegApur(String regApur) {
        this.regApur = regApur;
   }

   public BigDecimal getSitCadRf() {
        return sitCadRf;
   }

   public void setSitCadRf(BigDecimal sitCadRf) {
        this.sitCadRf = sitCadRf;
   }

   public BigDecimal getIntervAnalisCred() {
        return intervAnalisCred;
   }

   public void setIntervAnalisCred(BigDecimal intervAnalisCred) {
        this.intervAnalisCred = intervAnalisCred;
   }

   @Override
   public String getTableName() {
        return "TCSPAP";
   }

   @Override
   public String getEntityName() {
        return "ParceiroProspect";
   }

   @Override
   public ParceiroProspect fromVO(DynamicVO vo) {
        this.dhCadSefaz = vo.asTimestamp("DHCADSEFAZ");
        this.sitCadSefaz = vo.asString("SITCADSEFAZ");
        this.cgcCpf = vo.asString("CGC_CPF");
        this.codPap = vo.asBigDecimal("CODPAP");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codParcB2b = vo.asBigDecimal("CODPARCB2B");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.complemento = vo.asString("COMPLEMENTO");
        this.dataEmissaoRg = vo.asTimestamp("DATAEMISSAORG");
        this.diaPagto = vo.asBigDecimal("DIAPAGTO");
        this.dtCad = vo.asTimestamp("DTCAD");
        this.dtNasc = vo.asTimestamp("DTNASC");
        this.email = vo.asString("EMAIL");
        this.emissaoRg = vo.asString("EMISSAORG");
        this.endereco = vo.asString("ENDERECO");
        this.escolaridade = vo.asString("ESCOLARIDADE");
        this.estadoCivil = vo.asString("ESTADOCIVIL");
        this.identInscEstad = vo.asString("IDENTINSCESTAD");
        this.isPropostaCartao = vo.asString("ISPROPOSTACARTAO");
        this.limCred = vo.asBigDecimal("LIMCRED");
        this.naturalidade = vo.asBigDecimal("NATURALIDADE");
        this.nomeBai = vo.asString("NOMEBAI");
        this.nomeCartao = vo.asString("NOMECARTAO");
        this.nomeCid = vo.asString("NOMECID");
        this.nomeConjuge = vo.asString("NOMECONJUGE");
        this.nomeMae = vo.asString("NOMEMAE");
        this.nomePai = vo.asString("NOMEPAI");
        this.nomePap = vo.asString("NOMEPAP");
        this.nroAns = vo.asBigDecimal("NROANS");
        this.nroBen = vo.asBigDecimal("NROBEN");
        this.numEnd = vo.asString("NUMEND");
        this.observacoes = vo.asString("OBSERVACOES");
        this.possuiCartaoCredito = vo.asString("POSSUICARTAOCREDITO");
        this.qtdeDependentes = vo.asBigDecimal("QTDEDEPENDENTES");
        this.razaoSocial = vo.asString("RAZAOSOCIAL");
        this.rg = vo.asString("RG");
        this.sexo = vo.asString("SEXO");
        this.statusProposta = vo.asString("STATUSPROPOSTA");
        this.telCelular = vo.asString("TELCELULAR");
        this.telefone = vo.asString("TELEFONE");
        this.tipoResidencia = vo.asString("TIPORESIDENCIA");
        this.tipPessoa = vo.asString("TIPPESSOA");
        this.ufRg = vo.asBigDecimal("UFRG");
        this.cartaoCredito = vo.asString("CARTAOCREDITO");
        this.carteiraTrab = vo.asBigDecimal("CARTEIRATRAB");
        this.celularConjuge = vo.asString("CELULARCONJUGE");
        this.cep = vo.asString("CEP");
        this.cnae = vo.asString("CNAE");
        this.dhCadRf = vo.asTimestamp("DHCADRF");
        this.dtBaixa = vo.asTimestamp("DTBAIXA");
        this.dtIniAtiv = vo.asTimestamp("DTINIATIV");
        this.dtUltSit = vo.asTimestamp("DTULTSIT");
        this.indCredCte = vo.asBigDecimal("INDCREDCTE");
        this.indCredNfe = vo.asBigDecimal("INDCREDNFE");
        this.regApur = vo.asString("REGAPUR");
        this.sitCadRf = vo.asBigDecimal("SITCADRF");
        this.intervAnalisCred = vo.asBigDecimal("INTERVANALISCRED");
        return this;
   }
}
